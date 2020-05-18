import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre application de calcul");
		
		Calcul calcul = new Calcul();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le montant à decomposer : ");
		int montant = scan.nextInt();
		
		calcul.calculDecomposition(montant);

	}

}
