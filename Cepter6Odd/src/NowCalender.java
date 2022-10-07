
import java.util.Calendar;

public class NowCalender {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int what = cal.get(Calendar.AM_PM);
        System.out.println("현재 시간은 "+hour+"시 "+minute+"분입니다.");

        switch (what){
            case 0:
                if(hour>4 && hour<12){
                    System.out.println("Good Morning");
                }else{
                    System.out.println("Good Night");
                }
                break;
            case 1:
                if(hour<6){
                    System.out.println("Good Athernoon");
                }else if(hour <10){
                    System.out.println("Good Evening");
                }else{
                    System.out.println("Good Night");
                }
        }

    }
}
