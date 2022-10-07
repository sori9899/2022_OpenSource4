import javax.annotation.processing.SupportedSourceVersion;

interface Shape{
    final double PI=3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

public class Circle implements Shape {

    int radian;
    Circle(int num){
        this.radian = num;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 "+radian+"인 원입니다");
    }

    @Override
    public double getArea() {
        return PI * (double)radian *(double)radian;
    }

    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("면적은 "+donut.getArea());
    }
}
