abstract class Calculator{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

public class GoodCalc extends Calculator {

    @Override
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public int subtract(int a, int b){
        return a-b;
    }

    @Override
    public double average(int[] a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        return (double)sum/(a.length);
    }

    public static void main(String[] args){
        GoodCalc goodCalc = new GoodCalc();
        System.out.println(goodCalc.add(2,3));
        System.out.println(goodCalc.subtract(2,3));
        System.out.println(goodCalc.average(new int [] {2,3,4}));

    }
}
