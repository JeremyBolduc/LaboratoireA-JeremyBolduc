/*
    420-JGA-JQ
    Exercice : Salutation
 */
import java.util.Scanner;

public class Salutation {
    public static void main(String[] args){

        //Declaration des variables
        String nom;
        Scanner sc = new Scanner(System.in);

        //Question
        System.out.println("Quel est ton nom ?");
        nom = sc.next();
        System.out.println("Bonjour " + nom);

        sc.close();
    }
}
