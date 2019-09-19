/*
    420-JGA-JQ
    Exercice : Pythagore
 */
import java.util.Scanner;

public class Pythagore {
    public static void main(String[] args){

        //Declaration des variables
        Scanner sc = new Scanner(System.in);
        double A;
        double B;
        double pythagore;

        //Questions
        System.out.println("Quel est la valeur A ?");
        A = sc.nextDouble();
        System.out.println("Quel est la valeur B ?");
        B = sc.nextDouble();
        pythagore = (int) (Math.sqrt((Math.pow(A, 2) + (Math.pow(B, 2)))));
        System.out.println(" Valeur de pythagore :"+ pythagore);

        sc.close();
    }
}
