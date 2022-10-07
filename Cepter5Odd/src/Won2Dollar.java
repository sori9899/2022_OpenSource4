import java.util.Scanner;

abstract class Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다");
        System.out.print(getSrcString()+"을 입력하세요 >> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다");
        scanner.close();
    }
}

public class Won2Dollar extends Converter {

    String won;
    String dollar;
    public Won2Dollar(int ratio){
        this.ratio = ratio;
        this.won ="원";
        this.dollar= "달러";
    }

    @Override
    protected double convert(double val) {
        return val/(double)ratio;
    }

    @Override
    protected String getSrcString() {
        return won;
    }

    @Override
    protected String getDestString() {
        return dollar;
    }

    public static void main(String[] args) {
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();
    }
}
