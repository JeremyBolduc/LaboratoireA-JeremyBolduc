/*
    420-JGA-JQ
    Expert : Résolution
 */
import java.util.Scanner;

public class Resolution {
    public static void main(String[] args){

        //Declaration des variables
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double d;  //Discriminant

        //Entrée des valeurs
        System.out.println("Quelle est la valeur de a ?");
        a = sc.nextDouble();
        System.out.println("Quelle est la valeur de b ?");
        b = sc.nextDouble();
        System.out.println("Quelle est la valeur de c ?");
        c = sc.nextDouble();

        //Calcul
        d = Math.sqrt((Math.pow(b, 2) - (4*a*c)));
        x1 = (- b - d)/(2*a);
        x2 = (- b + d)/(2*a);

        //Affichage des résultats
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        sc.close();

    }
}
