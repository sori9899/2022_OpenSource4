interface Shape1{
    final double PI=3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle1 implements Shape1{
    int radians;

    Circle1(int radians){
        this.radians = radians;
    }
    @Override
    public void draw() {
        System.out.println("반지름이 "+radians+"인 원입니다.");
    }

    @Override
    public double getArea() {
        return PI*(double)radians*(double)radians;
    }

}

class Oval1 implements Shape1{

    int width, height;

    Oval1(int width, int height){
        this.height =height;
        this.width =width;
    }
    @Override
    public void draw() {
        System.out.println(width+"*"+height+"에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return (double)(width/2)*(double)(height/2)*PI;
    }
}

class Rect1 implements Shape1{

    int width, height;

    Rect1(int width, int height){
        this.width =width;
        this.height=height;
    }
    @Override
    public void draw() {
        System.out.println(width+"*"+height+"크기의 사각형입니다.");
    }

    @Override
    public double getArea() {
        return width*height;
    }
}

public class DrowShape {
    public static void main(String[] args) {
        Shape1 [] list = new Shape1[3];
        list[0] = new Circle1(10);
        list[1] = new Oval1(20,30);
        list[2] = new Rect1(10,40);

        for(int i=0; i<list.length; i++)
            list[i].redraw();
        for(int i=0; i<list.length; i++)
            System.out.println("면적은 "+list[i].getArea());
    }
}
