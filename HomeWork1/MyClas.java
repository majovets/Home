import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClas {
    public static void main(String[] args) throws Exception{


        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        double a,b;
        System.out.println("enter a ");
        a = Double.parseDouble(br.readLine());

        System.out.println("enter b ");
        b = Double.parseDouble(br.readLine());

        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a/b = "+(a/b));



    }


}
