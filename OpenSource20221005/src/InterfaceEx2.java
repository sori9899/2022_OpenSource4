interface PhoneInterface2{
    final int TIMEOUT =1000;
    void sendCall();
    void receiveCall();
    default void printLogo(){
        System.out.println("**Phone**");
    }
}


interface MobilePhoneInterface extends PhoneInterface2{
    void sendSMS();
    void receiveSMS();
}

interface MP3Interface{
    public void play();
    public void stop();
}

class PDA{
    public int calculater(int x, int y){
        return x+y;
    }
}
class SamsungPhone2 extends PDA implements MobilePhoneInterface, MP3Interface{

    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다");
    }

    public void flash() { System.out.println("전화기에 불이 켜졌습니다");}

    @Override
    public void sendSMS() {
        System.out.println("문자갑니다");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요");
    }

    @Override
    public void play() {
        System.out.println("음악 연주합니다");
    }

    @Override
    public void stop() {
        System.out.println("음악 중단합니다");
    }

    public void schedule(){
        System.out.println("일정 관리합니다");
    }
}

public class InterfaceEx2 {
    public static void main(String[] args) {
        SamsungPhone2 phone = new SamsungPhone2();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("3과 5를 더하면 "+ phone.calculater(3,5));
        phone.schedule();
    }
}