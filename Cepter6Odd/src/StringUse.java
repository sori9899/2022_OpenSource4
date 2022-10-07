import java.util.Scanner;

public class StringUse {
    static String readString(){
        StringBuffer sb = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals(";"))
                break;
            sb.append(line);
        }
        return sb.toString();
    }

    private static void Check(){
        String string;
        int [] buffer = new int[26];
        string = readString();

        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)>='A' && string.charAt(i)<='Z'){
                buffer[string.charAt(i)-65]++;
            }
            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
                buffer[string.charAt(i)-97]++;
            }
        }

        for(int i = 0; i<buffer.length; i++){
            System.out.print((char)(65+i)+" ");
            for(int j=0; j<buffer[i]; j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Check();
    }
}


/*
It's now or never, come hold me tight
Kiss me my darling, be mine tonight
Tomorrow will be too late
It's now or never, my love won't wait
When I first saw you, with your smile so lender
My heart was captured, my soul surrendered
I spent a lifetime, waiting for the right time
Now that your near, the time is here, at last
It's now or never, come hold me tight
Kiss me my darling, be mine tonight
Tomorrow will be too late
It's now or never, my love won't wait
 */