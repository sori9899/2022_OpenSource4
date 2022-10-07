import java.util.Scanner;

public class tomado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        int max = s.length();
        for(int i=0; i<s.length(); i++){
            System.out.println(s.substring(i+1,max)+s.substring(0,i+1));
        }
    }
}
