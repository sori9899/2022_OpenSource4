public class StringBufferEx_6 {
    public static void main(String[] args) {
        StringBuffer sb6 = new StringBuffer("This");

        sb6.append(" is pencil");
        System.out.println(sb6);

        sb6.insert(7," my");
        System.out.println(sb6);

        sb6.replace(8,10,"your");
        System.out.println(sb6);

        sb6.delete(8,13);
        System.out.println(sb6);

        sb6.setLength(4);
        System.out.println(sb6);

    }
}
