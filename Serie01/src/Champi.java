import java.util.Scanner;

public class Champi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("c�pe de Bordeaux, coprin chevelu ou agaric jaunissant.");

		System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
		Boolean lamelles = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
		Boolean anneau = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
		Boolean chapeau = sc.nextBoolean();
		System.out.print("Est-ce que votre champignon vit en for�t (true : oui, false : non) ? ");
		Boolean for�t = sc.nextBoolean();

		System.out.print("==> Le champignon auquel vous pensez est ");

		if(lamelles && anneau && chapeau && !for�t) {
			System.out.print("l'agaric jaunissant");
		} else if(lamelles && anneau && chapeau && for�t) {
			System.out.print("l'amanite tue-mouches");
		}  else if(!lamelles && !anneau && !chapeau && for�t) {
			System.out.print("le c�pe de Bordeaux");
		} else if(!lamelles && !anneau && chapeau && for�t) {
			System.out.print("le coprin chevelu");
		} else if(lamelles && !anneau && !chapeau && for�t) {
			System.out.print("la girolle");
		} else if(lamelles && !anneau && chapeau && for�t) {
			System.out.print("le pied bleu");

		}
		
	}

}
