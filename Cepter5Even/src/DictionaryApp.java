abstract class PairMap{
    protected String keyArray[];
    protected String valueArray[];
    abstract String get(String key);
    abstract void put(String key,  String value);
    abstract String delete(String key);
    abstract int length();
}

class Dictionary extends PairMap{

    int top;
    int max;

    public Dictionary(int num){
        this.keyArray = new String[num];
        this.valueArray = new String[num];
        this.top=0;
        this.max=num;
    }
    @Override
    String get(String key) {
        for(int i=0; i< keyArray.length; i++){
            if(key.equals(keyArray[i])){
                return valueArray[i];
            }
        }
        return "null";
    }

    @Override
    void put(String key, String value) {

        for(int i=0; i<top; i++){
            if(keyArray[i].equals(key)){
                valueArray[i] = value;
                return;
            }
        }

        if(top< keyArray.length){
            keyArray[top] = key;
            valueArray[top++] = value;
        }else{
            System.out.println("입력값을 초과하였습니다");
        }


    }

    @Override
    String delete(String key) {
        String temp;
        for(int i=0; i<top; i++){
            if(keyArray[i].equals(key)){
                temp =valueArray[i];
                valueArray[i]=null;
                return temp;
            }
        }
        return "잘못된 key값입니다";
    }

    @Override
    int length() {
        return top;
    }
}


public class DictionaryApp{


    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문","C++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }
}
