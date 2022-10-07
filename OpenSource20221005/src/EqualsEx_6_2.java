class Rect6{
    int wight;
    int height;
    public Rect6(int wight, int height){
        this.wight = wight;
        this.height = height;
    }

    public boolean equals(Object obj){
        Rect6 rect6 = (Rect6) obj;
        if(wight*height == rect6.wight* rect6.height)
            return true;
        else
            return false;
    }

}

public class EqualsEx_6_2 {
    public static void main(String[] args) {
        Rect6 a = new Rect6(2,3);
        Rect6 b= new Rect6(3,2);
        Rect6 c= new Rect6(3,4);

        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
        if(b.equals(c))
            System.out.println("b is equal to c");
    }
}
