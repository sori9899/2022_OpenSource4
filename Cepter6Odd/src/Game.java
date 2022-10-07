import java.util.Map;
import java.util.Scanner;

public class Game {

    static void Check(int num, int com){
        if( (num+1)%3 == com) {
            System.out.println("컴퓨터가 이겼습니다.");
        }else if( (num-1+3)%3 == com){
            System.out.println("철수가 이겼습니다.");
        }else{
            System.out.println("비겼습니다.");
        }
    }

    static String find(int n){
        switch (n){
            case 0:
                return "(가위)";
            case 1:
                return "(바위)";
            case 2:
                return "(보)";
        }
        return "몰라";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        int com =0;
        while(true){
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)] >>");
            num = scanner.nextInt();
            if(num==4){
                break;
            }
            num -= 1;
            com = (int)(Math.random()*3);
            System.out.println("철수"+find(num)+" : 컴퓨터"+find(com));
            Check(num, com);
        }
        scanner.close();

    }
}
