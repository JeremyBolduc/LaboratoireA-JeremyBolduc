/*
    420-JGA-JQ
    Exercice : Vecteur
 */
import java.util.Scanner;

public class Vecteur {
    public static void main(String[] args){

        //Declaration des variables
        Scanner sc = new Scanner(System.in);
        float xa;
        float xb;
        float ya;
        float yb;
        float za;
        float zb;
        float d; //distance

        //Entrée des données A
        System.out.println("Quelle est la valeur de xa ?");
        xa = sc.nextFloat();
        System.out.println("Quelle est la valeur de ya ?");
        ya = sc.nextFloat();
        System.out.println("Quelle est la valeur de za ?");
        za = sc.nextFloat();

        //Entrée des données B
        System.out.println("Quelle est la valeur de xb ?");
        xb = sc.nextFloat();
        System.out.println("Quelle est la valeur de yb ?");
        yb = sc.nextFloat();
        System.out.println("Quelle est la valeur de zb ?");
        zb = sc.nextFloat();

        //Calcul de la distance
        d = (float) Math.sqrt((Math.pow(xb-xa, 2)) + (Math.pow(yb-ya, 2)) + (Math.pow(zb-za, 2)));

        //Affichage des résultats
        System.out.println("Le point A ("+xa + "," + ya + "," + za +")");
        System.out.println("Le point B ("+xb + "," + yb + "," + zb +")");
        System.out.println("d(AB) = " + d);

        sc.close();
    }
}
