import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		
		int a;
		System.out.println("Bienvenue dans votre App-AnneeBissextile");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Donner l'annee : ");
		a = scan.nextInt();
		
		if (a > 0 && (a%400 == 0 || a%4 == 0 && a%100 != 0)) {
			System.out.println("L'annee "+ a +" est bissextile ");
		} else {
			System.out.println("L'annee "+ a +" n'est pas bissextile ");
		}

	}

}
