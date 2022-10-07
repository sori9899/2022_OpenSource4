import javax.swing.text.html.StyleSheet;
import java.util.Scanner;

abstract class Calc{
    protected int a;
    protected int b;

    abstract void setValue(int a, int b);
    abstract int calculate();
}

class Add extends Calc{

    @Override
    void setValue(int a, int b) {
        this.a = a;
        this.b =b;
    }

    @Override
    int calculate() {
        return a+b;
    }
}

class Sub extends Calc{
    @Override
    void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }

    @Override
    int calculate(){
        return a-b;
    }
}

class Mul extends Calc{
    @Override
    void setValue(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    int calculate(){
        return a*b;
    }
}

class Div extends Calc{
    @Override
    void setValue(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    int calculate(){
        return a/b;
    }
}

public class Calculator {
    public static void main(String[] args) {

        Add add= new Add();
        Sub sub = new Sub();
        Div div = new Div();
        Mul mul = new Mul();

        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오 >>");
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        String s = scanner.next();

        switch (s){
            case "+":
                add.setValue(a,b);
                System.out.println(add.calculate());
                break;
            case "-":
                sub.setValue(a,b);
                System.out.println(sub.calculate());
                break;
            case "*":
                div.setValue(a,b);
                System.out.println(div.calculate());
                break;
            case "/":
                div.setValue(a,b);
                System.out.println(mul.calculate());
                break;
        }
        scanner.close();
    }
}
