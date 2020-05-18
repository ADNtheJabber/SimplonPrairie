import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre application de Calcul");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir a : ");
		int a = scan.nextInt();
		
		
		System.out.println("Veuillez saisir b : ");
		int b = scan.nextInt();
		 
		if(b!=0) {
			
			Calcul calcul = new Calcul();
			
			System.out.println("a = "+ a +" /|/ b = "+ b +" ");
			System.out.println("Le quotient est : " + calcul.calculQuotient(a, b));
			System.out.println("Le reste est : "+ calcul.calculReste(a, b));
			System.out.println("Le ratio est : " + calcul.calculRatio(a, b));
			
		} else {
			System.out.println("Division par 0 impossible !");
		}
		
		
		
	}

}
