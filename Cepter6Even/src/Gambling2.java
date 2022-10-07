
import java.io.IOException;
import java.util.Scanner;

class Person2{
    String name;
    Person2(){
        this.name = " ";
    }

    Person2(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    boolean Check(){
        int a = (int)(Math.random()*3+1);
        int b = (int)(Math.random()*3+1);
        int c = (int)(Math.random()*3+1);

        System.out.print("    "+a+" "+b+" "+c);
        if(a==b && b==c){
            System.out.println("    "+name+"님이 이겼습니다!");
            return true;
        }else{
            System.out.println("    아쉽군요!");
            return false;
        }
    }

}

public class Gambling2 {

    public static void pause(){
        try{
            System.in.read();
        }catch (IOException e){ }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("겜블링에 참여할 선수 숫자 >>");
        int num = scanner.nextInt();
        Person2[] p2 = new Person2[num];
        int person=0;

        for(int i=0; i< p2.length; i++){
            System.out.print((i+1)+"번쨰 선수 이름 >> ");
            p2[i] = new Person2();
            p2[i].name = scanner.next();
        }

        while(true){
            if(person>=num)
                person=0;
            System.out.print(p2[person].getName()+"Enter");
            pause();
            if(p2[person].Check())
                break;
            person++;
        }
    }
}
