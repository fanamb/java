import java.util.Scanner;

public class ExpressionConditionnelle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre entier");
		int nombre = sc.nextInt();
		if(nombre % 2 == 0) {
			System.out.print("Le nombre est pair ");
		} else {
			System.out.print("Le nombre est impair ");
		}
		
		if(nombre < 0){
			System.out.println("et négatif");
		} else if (nombre > 0) {
			System.out.println("et positif");
		} else {
			System.out.println("et 0");
		}
	}

}
