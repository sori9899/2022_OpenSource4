class ColorTv{
    static int inch;
    static int color;

    public ColorTv(int inch, int color){
        this.inch = inch;
        this.color = color;
    }

    static void getProperty(){
        System.out.println( inch+"인치 "+color+"컬러");
    }
}
public class IPTV extends ColorTv {

    static String s;

    public IPTV(String s, int inch, int color){
        super(inch, color);
        this.s =s;
    }

    public void printProperty(){
        System.out.print("나의 IPTV는 "+s+" ");
        getProperty();
    }

    public static void main(String[] args) {
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

        iptv.printProperty();
    }
}
