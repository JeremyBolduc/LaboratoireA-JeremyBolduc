/*
    420-JGA-JQ
    Exercice : Convertisseur 1
 */
import java.util.Scanner;

public class Convertisseur1 {
    public static void main(String[] args){

        //Declaration des variables
        float radian;
        int degre;
        Scanner sc = new Scanner(System.in);

        //Question
        System.out.println("Quel est l'angle en radian ?");
        radian = sc.nextFloat();
        degre = (int)(180 * (radian/Math.PI));
        System.out.println("Valeur en degre :" + degre);

        sc.close();

    }
}
