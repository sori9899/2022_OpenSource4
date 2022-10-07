public class ColorTv {
    static int inch;
    static int color;

    public ColorTv(int inch, int color){
        this.inch = inch;
        this.color = color;
    }

    public void getProperty(){
        System.out.println( inch+"인치 "+color+"컬러");
    }

    public static void main(String[] args) {
        ColorTv colorTv = new ColorTv(32, 2048);
        colorTv.getProperty();
    }
}
