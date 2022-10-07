class Point6{
    int x,y;
    public Point6(int x, int y){
        this.x = x;
        this.y=y;

    }
}

public class ObjectPropertyEx_6 {
    public static void print(Object obj){
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }

    public static void main(String[] args){
        Point6 p6 = new Point6(2,3);
        print(p6);
    }
}
