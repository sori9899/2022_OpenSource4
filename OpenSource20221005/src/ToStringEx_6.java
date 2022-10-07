class Point6_1{
    int x,y;
    public Point6_1(int x, int y){
        this.x =x;
        this.y =y;
    }

    public String toString(){
        return "Point("+x+","+y+")";
    }
}

public class ToStringEx_6 {
    public static void main(String[] args) {
        Point6_1 point6_1 = new Point6_1(2,3);
        System.out.println(point6_1.toString());
        System.out.println(point6_1);
        System.out.println(point6_1+"입니다");
    }
}
