import java.awt.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Javanais {
 
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Character> voyelles; 
    private static ArrayList<Character> consonnes; 
    private static char espace = ' ';
     
    public static void main(String[] args) {
        String choix;
        Boolean erreur;
        String recommencer = "oui";
         
        initialisation();
         
        while(recommencer.equals("oui")){
            //Oblige l'utilisateur à mettre la lettre demandée et permet de connaitre son choix de traduction
            do{
                System.out.println("Si vous voulez passer du français au javanais, tapez f sinon tapez j");
                choix = sc.nextLine();
                if(choix.equals("f") || choix.equals("j") ){
                    erreur = false;
                } else {
                    erreur = true;
                    System.out.println("Veuillez taper f ou j");
                }
            } while(erreur);
             
                 
            //En fonction du choix de l'utilisateur cela rentrera dans la méthode désirée
            if(choix.equals("f")) {
                francaisToJavanais();
            } else if(choix.equals("j")) {
                javanaisToFrancais();
            }
             
            //Oblige l'utilisateur à mettre la lettre demandée et permet de savoir s'il veut recommencer
            do{
                System.out.println("Voulez recommencer ? (oui / non)");
                recommencer = sc.nextLine();
                if(recommencer.equals("oui") || recommencer.equals("non") ){
                    erreur = false;
                } else {
                    erreur = true;
                    System.out.println("Veuillez taper oui ou non");
                }
            } while(erreur);
             
        }
         
    }
 
    private static void initialisation() {
        voyelles = new ArrayList<Character>();
        voyelles.add('a');
        voyelles.add('e');
        voyelles.add('i');
        voyelles.add('o');
        voyelles.add('u');
        voyelles.add('y');
         
        consonnes = new ArrayList<Character>();
        consonnes.add('b');
        consonnes.add('c');
        consonnes.add('d');
        consonnes.add('f');
        consonnes.add('g');
        consonnes.add('h');
        consonnes.add('j');
        consonnes.add('k');
        consonnes.add('l');
        consonnes.add('m');
        consonnes.add('n');
        consonnes.add('p');
        consonnes.add('q');
        consonnes.add('r');
        consonnes.add('s');
        consonnes.add('t');
        consonnes.add('v');
        consonnes.add('w');
        consonnes.add('x');
        consonnes.add('z');
    }
 
    /*
     * Permet de traduire le javanais en français
     */
    private static void javanaisToFrancais() {
      System.out.println("Tapez votre texte en javanais afin de le traduire en français");
      String phrase = sc.nextLine();
      phrase = phrase.toLowerCase();
      
      //Boucle permettant d'avoir chaques caractères de la phrase
      for (int lettre = 0; lettre < phrase.toCharArray().length; lettre++) {
    	  //Vérifie que ça concerne bien les caractères a et v
    	  if(lettre <  phrase.toCharArray().length - 1 && phrase.toCharArray()[lettre] == 'a' && phrase.toCharArray()[lettre + 1] == 'v'){
			//Vérifie que les lettres av soit entre une consonne et une voyelle
			if(lettre > 0 && consonnes.contains(phrase.toCharArray()[lettre - 1])  && voyelles.contains(phrase.toCharArray()[lettre + 2])) {
				phrase = phrase.substring(0, lettre) + phrase.substring(lettre + 2, phrase.toCharArray().length);
			}
    	  }
      }

      System.out.println("La traduction est " + phrase);
    }
 
    /*
     * Permet de traduire le français en javanais
     */
    private static void francaisToJavanais() {
        System.out.println("Tapez votre texte en français afin de le traduire en javanais");
        String phrase = sc.nextLine();
        phrase = phrase.toLowerCase();
         
        //Boucle permettant d'avoir chaques caractères de la phrase
        for (int lettre = 0; lettre < phrase.toCharArray().length; lettre++) {
            //Vérifie que ce soit la première lettre d'un mot et bien une voyelle
            if((lettre == 0 || phrase.toCharArray()[lettre - 1] == espace) && (voyelles.contains(phrase.toCharArray()[lettre]))){
                phrase = ajoutAv(phrase, lettre, phrase.toCharArray().length);
                lettre += 2;
            }
            //Vérifie que c'est entre une consonne et une voyelle
            if(lettre <  phrase.toCharArray().length - 1){
	            if(consonnes.contains(phrase.toCharArray()[lettre]) && voyelles.contains(phrase.toCharArray()[lettre + 1])) {
	                phrase = ajoutAv(phrase, lettre + 1, phrase.toCharArray().length);
	                lettre += 2;
	                 
	            }
	        }
             
        }
 
        System.out.println("La traduction est " + phrase);
    }
 
    private static String ajoutAv(String phrase, int lettre, int taille) {
        String phrase1 = phrase.substring(0, lettre);
        String phrase2 = phrase.substring(lettre, taille);
        return phrase1 + "av" + phrase2;
         
    }
 
}