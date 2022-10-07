import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

interface Stack{
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}

class StringStack implements Stack{

    String []string;
    int length;
    int capacity;



    public StringStack(int num){
        this.string = new String[num];
        this.length=0;
        this.capacity = num;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public String pop() {
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 >> ");
        temp =scanner.next();

        if(temp.equals("그만"))
            return "NO";

        if(length>capacity-1){
            System.out.println("스택이 꽉 차서 푸시 불가!");
            length=capacity;
            return "Fail";
        }else{
            string[length++] = temp;
        }
        //System.out.println(length);
        return "Success";
    }

    @Override
    public boolean push(String val) {
        if(length>=0){
            System.out.print(val+" ");
            length--;
            if(length <0)
                return false;
            return true;
        }else{
            return false;
        }
    }
}

public class StackApp {
    public static void main(String[] args) {
        StringStack stack;
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        int num = scanner.nextInt();
        stack = new StringStack(num);

        while(true){
             if(stack.pop().equals("NO")){
                 break;
             }
        }
        stack.length -= 1;
        System.out.print("스택에 저장된 모든 문자열 팝 : ");
        while(stack.push(stack.string[stack.length()]));
        scanner.close();
    }
}
