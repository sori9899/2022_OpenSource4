class Point{
    private int x,y;
    public Point(int x, int y){ this.x =x; this.y=y;}
    public int getX(){return x;}
    public int getY(){return y;}
    protected void move(int x,int y ){this.x=x; this.y=y;}
}


public class ColorPoint extends Point {

    String color;

    public ColorPoint(){
        super(0,0);
        this.color="Black";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
        this.color ="Black";
    }

    public void setXY(int x, int y){
        this.move(x,y);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        return color+"의 색은 ("+getX()+","+getY()+")의 점";
    }

    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString()+"입니다");

        ColorPoint cp = new ColorPoint(10,10);
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다");
    }
}
