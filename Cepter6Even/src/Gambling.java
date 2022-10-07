import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

class Person{
    String name;
    Person(){
        this.name = " ";
    }

    Person(String name){
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

public class Gambling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.print("1번째 선수 이름 >>");
        p1.name = scanner.next();
        System.out.print("2번째 선수 이름 >>");
        p2.name = scanner.next();

        while (true){
            System.out.println(p1.getName()+"Enter");
            scanner.nextLine();
            if(p1.Check())
                break;

            System.out.println(p2.getName()+"Enter");
            scanner.nextLine();
            if(p2.Check())
                break;
        }
    }
}
