/*
    420-JGA-JQ
    Expert : Expérience verte
 */
import java.util.Scanner;

public class ExperienceVerte {
    public static void main(String[] args){

        //Declaration des variables
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int co2;
        int k;

        System.out.println("Quelle quantité de a ?");
       a = sc.nextInt();
       System.out.println("Quelle quantité de b ?");
       b = sc.nextInt();
       System.out.println("Quelle quantité de c?");
       c = sc. nextInt();
       System.out.println("Quelle quantité de d?");
       d = sc.nextInt();
       System.out.println("Quelle quantité de e?");
       e = sc.nextInt();
       System.out.println("Quelle quantité de f?");
       f = sc.nextInt();
       System.out.println("Quelle quantité de co2?");
       co2 = sc.nextInt();

        System.out.println("Quantitées initiales : a = "+a+", b = "+b+", c = "+c+", d = "+d+", e = "+e+", f = "+f+", " +
                "co2 = "+co2+"");

        //Réaction 1
        k = Math.min(a/2,b/4);
        a -= 2*k;
        c -= 4*k;
        d += 3*k;
        co2 += k;

        System.out.println("Quantitées initiales : a = "+a+", b = "+b+", c = "+c+", d = "+d+", e = "+e+", f = "+f+", " +
                "co2 = "+co2+"");

        //Réaction 2
        k = Math.min(c/2, e);
        b -= k;
        c -= 2*k;
        e -= k;
        f += 4*k;
        co2 += 4*k;

        System.out.println("Quantitées initiales : a = "+a+", b = "+b+", c = "+c+", d = "+d+", e = "+e+", f = "+f+", " +
                "co2 = "+co2+"");

        // Réaction 3
        k = Math.min(2*a,f/4);
        a -= k/2;
        f -= 4*k;
        b += k;
        e += 4*k;
        co2 += k;

        System.out.println("Quantitées initiales : a = "+a+", b = "+b+", c = "+c+", d = "+d+", e = "+e+", f = "+f+", " +
                "co2 = "+co2+"");

        sc.close();

    }
}
