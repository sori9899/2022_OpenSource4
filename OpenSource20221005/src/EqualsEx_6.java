class Point6_2{
    int x,y;
    public Point6_2(int x, int y){
        this.x=x;
        this.y=y;
    }

    public boolean equals(Object obj) {
        Point6_2 p6_2 = (Point6_2) obj;
        if (x == p6_2.x && y == p6_2.y) {
            return true;
        } else {
            return false;
        }
    }
}

public class EqualsEx_6 {
    public static void main(String[] args){
        Point6_2 a = new Point6_2(2,3);
        Point6_2 b = new Point6_2(2,3);
        Point6_2 c= new Point6_2(3,4);

        if(a==b)
            System.out.println("a==b");
        if(a.equals(b))
            System.out.println("a is equal to b");
        if(a.equals(c))
            System.out.println("a is equal to c");
    }
}
