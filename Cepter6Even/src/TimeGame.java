import java.util.Calendar;
import java.util.Scanner;

public class TimeGame {

    public static void main(String[] args) {
        Calendar cal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("10초에 가까운 사람이 이기는 게임입니다");
        System.out.println("황기태 시작 Enter키");
        scanner.nextLine();
        scanner.nextLine();

        cal = Calendar.getInstance();
        int now_second = cal.get(Calendar.SECOND);
        System.out.println("현제 초 = " + now_second);
        System.out.println("10초 예상후 Enter");

        scanner.nextLine();
        cal = Calendar.getInstance();
        int first = cal.get(Calendar.SECOND);
        System.out.println("현제 초 = " + first);
        int result = now_second-first;
        System.out.println(Math.abs(result));
    }
}
