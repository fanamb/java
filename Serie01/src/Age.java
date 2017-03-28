import java.util.Calendar;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donnez votre age");
		int age = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		int anneeActuel = c.get(Calendar.YEAR);
		
		int annee = anneeActuel - age;
		
		System.out.println("Votre année de naissance est le : " + annee);
	}

}
