import java.util.Scanner;

public class CorrectionString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        String s = scanner.nextLine();

        while (true){
            System.out.print("명령: ");
            String order = scanner.nextLine();
            if(order.equals("그만"))
                break;
            if(order.indexOf("!") == 0){
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            String[] buffer = order.split("!");
            if(buffer[0].equals(" ")){
                System.out.println("잘못된 명령입니다!");
            }else{
                if(s.indexOf(buffer[0])==-1){
                    System.out.println("찾을 수 없습니다!");
                }else{
                    s=s.replaceFirst(buffer[0], buffer[1]);
                    System.out.println(s);
                }
            }

        }
        scanner.close();
    }
}
