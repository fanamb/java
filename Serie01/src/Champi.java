import java.util.Scanner;

public class Champi {

	public static void main(String[] args) {
		Boolean lamelles, anneau, chapeau, foret;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");


		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
		anneau = sc.nextBoolean();
		if(anneau) {
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
			chapeau = sc.nextBoolean();
			System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
			foret = sc.nextBoolean();
			lamelles = true;
		} else {
			System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
			lamelles = sc.nextBoolean();
			System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
			chapeau = sc.nextBoolean();
			foret = true;
		}

		System.out.print("==> Le champignon auquel vous pensez est ");

		if(lamelles && anneau && chapeau && !foret) {
			System.out.print("l'agaric jaunissant");
		} else if(lamelles && anneau && chapeau && foret) {
			System.out.print("l'amanite tue-mouches");
		}  else if(!lamelles && !anneau && !chapeau && foret) {
			System.out.print("le cèpe de Bordeaux");
		} else if(lamelles && anneau && !chapeau && !foret) {
			System.out.print("le coprin chevelu");
		} else if(lamelles && !anneau && !chapeau && foret) {
			System.out.print("la girolle");
		} else if(lamelles && !anneau && chapeau && foret) {
			System.out.print("le pied bleu");

		}
		
	}

}
