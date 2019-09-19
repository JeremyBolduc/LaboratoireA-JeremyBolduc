/*
    420-JGA-JQ
    Exercice : Convertisseur 2
 */
import java.util.Scanner;

public class Convertisseur2 {
    public static void main(String[] args){

        //Declaration des variables
        Scanner sc = new Scanner(System.in);
        int degre;
        float radian;

        // Question
        System.out.println("Quel est l'angle en degre ?");
        degre = sc.nextInt();
        radian = (float) (Math.toRadians(degre));
        System.out.println(" Valeur en radian :"+ radian);

        sc.close ();
    }
}
