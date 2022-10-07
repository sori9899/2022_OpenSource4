import java.util.Scanner;
import java.util.StringTokenizer;

public class Namespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while(true){
            System.out.print(">>");
            s=scanner.nextLine();
            if(s.equals("그만"))
                break;
            StringTokenizer tk = new StringTokenizer(s);
            System.out.println("(1) StringTokenizer를 사용한 어절 개수는 "+tk.countTokens());
            String[] str = s.split(" ");
            System.out.println("(2) split을 사용한 어절 개수는 " + str.length);
        }
        scanner.close();
    }
}
