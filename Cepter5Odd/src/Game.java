import java.util.Scanner;
class Bear extends GameObject{

    public Bear(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    @Override
    protected void move() {
        String c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >>");
        c= scanner.next();

        if(c.equals("a")){
            if( getY() > 0){
                Array.ClearPosition(getX(), getY());
                y = y-1;
                Array.setBearPosition(this);
            }else{
                System.out.println("이동할 수 없습니다. 다시 선택해주세요");
            }
        }

        if(c.equals("s")){
            if( getX() < 9){
                Array.ClearPosition(getX(), getY());
                x = x+1;
                Array.setBearPosition(this);
            }else{
                System.out.println("이동할 수 없습니다. 다시 선택해주세요");
            }
        }

        if(c.equals("d")){
            if( getX() > 0){
                Array.ClearPosition(getX(), getY());
                x = x-1;
                Array.setBearPosition(this);
            }else{
                System.out.println("이동할 수 없습니다. 다시 선택해주세요");
            }
        }

        if(c.equals("f")){
            if( getY() < 19){
                Array.ClearPosition(getX(), getY());
                y = y+1;
                Array.setBearPosition(this);
            }else{
                System.out.println("이동할 수 없습니다. 다시 선택해주세요");
            }
        }
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}

class Fish extends GameObject{
    int staypoint;
    int movepoint;


    void setStaypoint(){
        this.staypoint =0;
    }

    void setMovepoint(){
        this.movepoint =0;
    }

    /*
    int getStaypoint(){
        return staypoint;
    }

    int getMovepoint(){
        return movepoint;
    }
    */

    public Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    @Override
    protected void move() {
        Boolean bo = true;
        int num = (int)(Math.random()*4+1);
        // 이동 방향 결정
        int desicion = (int)(Math.random()*2);

        if(desicion == 1){
            if(staypoint<3){
                staypoint++;
            }else{
                desicion=0;
            }
        }

        if(desicion==0){
            if(movepoint<2){
                while (bo){
                    switch (num){
                        case 1:
                            if(getY() > 0){
                                Array.ClearPosition(getX(), getY());
                                y=y-1;
                                Array.setFishPosition(this);
                                movepoint++;
                                bo=false;
                                break;
                            }
                        case 2:
                            if(getX() <9){
                                Array.ClearPosition(getX(), getY());
                                x = x+1;
                                Array.setFishPosition(this);
                                movepoint++;
                                bo=false;
                                break;
                            }
                        case 3:
                            if(getX() >0){
                                Array.ClearPosition(getX(), getY());
                                x = x-1;
                                Array.setFishPosition(this);
                                movepoint++;
                                bo=false;
                                break;
                            }
                        case 4:
                            if(getY()<19){
                                Array.ClearPosition(getX(), getY());
                                y = y+1;
                                Array.setFishPosition(this);
                                movepoint++;
                                bo=false;
                                break;
                            }
                    }
                    num = (int)(Math.random()*4+1);
                }
            }else{
                staypoint++;
            }
        }

        //System.out.println(getMovepoint()+" "+getStaypoint());
        if(staypoint+movepoint == 5){
            staypoint=0;
            movepoint=0;
        }
        //System.out.println(getMovepoint()+" "+getStaypoint());
    }

    @Override
    protected char getShape() {
        return '@';
    }

}

class Array{
    static char [][] gameboard;

    static int old_x;
    static int old_y;

    public static void setOldPosition(int x, int y){
        old_x = x;
        old_y = y;
    }
    public static void setGameboard() {
        gameboard = new char[10][20];
        for(int i=0; i<gameboard.length; i++){
            for(int j=0; j<gameboard[i].length; j++){
                gameboard[i][j] ='-';
            }
        }
    }

    public static void printGameboard(){
        for(int i = 0; i< gameboard.length; i++){
            for(int j = 0; j< gameboard[i].length; j++){
                System.out.print(gameboard[i][j]);
            }
            System.out.println();
        }
    }

    public static void setBearPosition(Bear bear){
        gameboard[bear.getX()][bear.getY()] = bear.getShape();
    }

    public static void setFishPosition(Fish fish){
        gameboard[fish.getX()][fish.getY()] = fish.getShape();
    }

    public static void ClearPosition(int x, int y){
        gameboard[x][y] ='-';
    }

    public static boolean CheckChange(Bear bear){
        if(bear.getX() == old_x && bear.getY() == old_y )
            return false;
        return true;
    }
}


public class Game {
    public static void main(String[] args) {

        Bear bear = new Bear(0,0, 1);
        Fish fish = new Fish(7, 10, 1);
        Array.setGameboard();

        // 첫 세팅
        Array.setBearPosition(bear);
        Array.setFishPosition(fish);

        System.out.println("** Bear의 fish먹기 게임을 시작합니다");
        // 무한 반복
        while(true){
            Array.printGameboard();
            if(bear.collide(fish)){
                System.out.println("Bear Wins!!");
                break;
            }
            Array.setOldPosition(bear.getX(), bear.getY());
            //System.out.println(bear.getX()+" "+ bear.getY());
            bear.move();
            // System.out.println(Array.CheckChange(bear));
            // System.out.println((bear.collide(fish)));
            if(Array.CheckChange(bear) && !(bear.collide(fish))){
                System.out.println("fish실행");
                fish.move();
            }
        }

    }
}
