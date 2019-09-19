/*
    420-jga-jq
    Standard : Boite Noire
 */
import java.util.Scanner;

public class BoiteNoire {
    public static void main (String[] args){

        //Declaration des variables
        Scanner sc = new Scanner(System.in);
        double poidsBoite;
        double volumeBoite;
        double poidsTotal;
        double mvSphere;
        double poidsSphere;
        double rayonSphere;
        double volumeSphere;
        double quantiteSubstance;
        double mvSubstance;
        double poidsSubstance;
        double volumeSubstance;

        //Boite noire
        poidsBoite = 375;
        volumeBoite = 125;

        //Sphere
        rayonSphere = 2.15;
        mvSphere = 3517;
        volumeSphere = (((4*Math.PI*Math.pow(rayonSphere, 3))/3));
        poidsSphere = (mvSphere*volumeSphere);

        //Substance isolante
        mvSubstance = 13545.88;
        volumeSubstance = (volumeBoite-volumeSphere);
        quantiteSubstance =(volumeSubstance*1000);
        poidsSubstance = (mvSubstance*volumeSubstance);

        //Poids total
        poidsTotal = (poidsBoite+poidsSphere+poidsSubstance);

        //Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("- RAPPORT D'INFORMATIONS");
        System.out.println(" Sphere");
        System.out.println(" * Masse volumique : " + mvSphere + " kg/m3");
        System.out.println(" * Poids : " + poidsSphere + " kg");
        System.out.println(" * Rayon : " + rayonSphere + " m");
        System.out.println(" * Volume : " + volumeSphere + " m3");
        System.out.println(" Substance isolante");
        System.out.println(" * Masse volumique : " + mvSubstance + " kg/m3");
        System.out.println(" * Poids : " + poidsSubstance + " kg");
        System.out.println(" * Volume : " + volumeSubstance + " m3");
        System.out.println(" * Quantite : " + quantiteSubstance + " l");
        System.out.println(" Boite noire");
        System.out.println(" * Poids : " + poidsBoite+ " kg");
        System.out.println(" * Volume : " + volumeBoite + " m3");
        System.out.println(" * Poids total : " + poidsTotal + " kg");
        System.out.println("-------------------------------------------");

        sc.close();


    }
}
