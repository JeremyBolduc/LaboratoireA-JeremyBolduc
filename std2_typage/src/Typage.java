/*
    420-JGA-JQ
    Standard : Typage
 */
import java.util.Scanner;

public class Typage {
    public static void main(String[] args){

        //Declaration des variables
        Scanner sc = new Scanner(System.in);
        int var1;
        float var2;
        char var3;
        char var4;

        //Conversion 1
        var1= (int) 5;
        String var1AsString = String.valueOf(var1);
        System.out.println("Conversion #1 = "+ var1AsString);

        //Conversion 2
        var1= (int) 5;
        boolean bool = (var1 == 5);
        System.out.println("Conversion #2 = "+ bool);

        //Conversion 3
        var2= (float) 5.5;
        int b;
        b=(int)var2;
        System.out.println("Conversion #3 = "+b);

        //Conversion 4
        var2= (float) 5.5;
        var2 = Math.round(5.5);
        String var2AsString = String.valueOf(var2);
        System.out.println("Conversion #4 = "+var2AsString);

        //Conversion 5
        var3= (char) 65;
        var4= 'a';
        int c = 53 - '0';
        System.out.println("Conversion #5 = "+ c);
        int d = 'a' - '0';
        System.out.println("Conversion #5 = "+ d);

        sc.close();
    }
}
