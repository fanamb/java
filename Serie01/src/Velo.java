import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
    	if(debut < 0 || debut > 24 || fin < 0 || fin > 24){
    		System.out.println("Les heures doivent être comprises entre 0 et 24 !");
    	} else if(debut == fin) {
    		System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
    	} else if(debut > fin) {
        	System.out.println("Bizarre, le début de la location est après la fin ...");
        } else {
        	System.out.println("Vous avez loué votre vélo pendant ");
        	
        	int temps = 0;
        	double tarif = 0;
        	
        	if(debut < 7){
        		if(fin <= 7) {
            		temps = fin - debut;
            		tarif = temps;
            		System.out.println(temps +" heure(s) au tarif horaire de 1.0 franc(s)");
            		System.out.print("Le montant total à payer est de ");
            		System.out.print(tarif);
                    System.out.println(" franc(s).");
        		} else if(fin >= 17) {
        			temps = (7 - debut) + (fin - 17);
            		System.out.println(temps +" heure(s) au tarif horaire de 1.0 franc(s)");
            		tarif = 20 + temps;
            		System.out.println(10 +" heure(s) au tarif horaire de 2.0 franc(s)");
            		System.out.print("Le montant total à payer est de ");
            		System.out.print(tarif);
                    System.out.println(" franc(s).");
        		} else {
        			temps = 7 - debut;
            		System.out.println(temps +" heure(s) au tarif horaire de 1.0 franc(s)");
            		tarif = temps;
        			temps = fin - 7;
        			tarif += temps * 2;
            		System.out.println(temps +" heure(s) au tarif horaire de 2.0 franc(s)");
            		System.out.print("Le montant total à payer est de ");
            		System.out.print(tarif);
                    System.out.println(" franc(s).");
        		}
        	} else if(debut >= 17){
        		temps = fin - debut;
        		tarif = temps;
        		System.out.println(temps +" heure(s) au tarif horaire de 1.0 franc(s)");
        		System.out.print("Le montant total à payer est de ");
        		System.out.print(tarif);
                System.out.println(" franc(s).");
        	} else {
        		if(fin > 17) {
        			
        			temps = fin - 17;
        			tarif += temps;
            		System.out.println(temps +" heure(s) au tarif horaire de 1.0 franc(s)");
            		temps = 17 - debut;
            		System.out.println(temps +" heure(s) au tarif horaire de 2.0 franc(s)");
                    tarif += temps * 2;
            		System.out.print("Le montant total à payer est de ");
            		System.out.print(tarif);
                    System.out.println(" franc(s).");
        		} else {
            		temps = fin - debut;
            		tarif = temps * 2;
            		System.out.println(temps +" heure(s) au tarif horaire de 2.0 franc(s)");
            		System.out.print("Le montant total à payer est de ");
            		System.out.print(tarif);
                    System.out.println(" franc(s).");
        		}
        	}
        	
        	
            
        }
        
        

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}