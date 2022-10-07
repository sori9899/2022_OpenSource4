import java.util.Scanner;

class Line extends Shape{

    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape{

    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class GraphicEditor extends Shape{

    Shape top;
    int max;

    public GraphicEditor(){
        this.top = null;
        this.max=0;
    }

    public void pop(Scanner scanner){
        System.out.print("Line(1), Rect(2), Circle(3) >> ");
        int num = scanner.nextInt();
        System.out.println("Start  "+top);
        switch (num){
            case 1:
                Line line = new Line();
                if(top == null){
                    top = line;
                    System.out.println("Top : "+top);
                    this.setNext(line);
                }else{
                    top.setNext(line);
                    top = top.getNext();
                    System.out.println("Top2 : "+top);
                }
                max++;
                break;
            case 2:
                Rect rect = new Rect();
                if(top == null){
                    top = rect;
                    this.setNext(rect);
                }else{
                    top.setNext(rect);
                    top = top.getNext();
                    System.out.println("Rect2 : "+top);
                }
                max++;
                break;
            case 3:
                Circle circle = new Circle();
                if(top == null){
                    top = circle;
                    this.setNext(circle);
                }else{
                    top.setNext(circle);
                    top = top.getNext();
                    System.out.println("Circle2 : "+top);
                }
                max++;
                break;
        }
    }

    public void push(Scanner scanner){
        System.out.print("삭제할 도형의 위치 >> ");
        Shape temp = this.getNext();
        Shape buffer;

        int num = scanner.nextInt();
        if(num > max || num<=0){
            System.out.println("삭제할 수 없습니다");
        } else if( num ==1 || max ==1){
            this.setNext(temp.getNext());
            top=null;
            max--;
        } else{
            for(int i=1; i<=max ;i++){
                if(i==num-1)
                    break;
                temp =temp.getNext();
            }
            buffer = temp.getNext();
            System.out.print("buffer : " );
            buffer.draw();
            temp.setNext(buffer.getNext());
            System.out.print("temp : " );
            temp.draw();
            System.out.println(max);
            if(num == max){
                top = temp;
            }
            max--;
        }
    }
    public void showAll(){
        Shape temp = this.getNext();

        while(temp != null){
            temp.draw();
            temp = temp.getNext();
        }

    }

    @Override
    public void draw() {

    }
}



public class Graphic{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphicEditor graphicEditor = new GraphicEditor();
        int num=0;
        System.out.print("그래픽 에디터 beauty을 실행합니다");
        while (num != 4){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            num = scanner.nextInt();
            switch (num){
                case 1:
                    graphicEditor.pop(scanner);
                    break;
                case 2:
                    graphicEditor.push(scanner);
                case 3:
                    graphicEditor.showAll();
                    break;
                case 4:
                    System.out.println("beauty를 종료합니다");
                    break;
            }
        }

    }
}
