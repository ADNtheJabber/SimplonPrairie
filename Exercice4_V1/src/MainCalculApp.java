import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre application de Calcul");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir x : ");
		float x = scan.nextFloat();
		
		
		System.out.println("Veuillez saisir n: ");
		int n = scan.nextInt();
		 
		Calcul calcul = new Calcul();
			System.out.println("x = "+ x +" -- n = "+ n);
			System.out.println("x puissance n donne : " + calcul.calculPuissance(x, n));
	}

	
}
