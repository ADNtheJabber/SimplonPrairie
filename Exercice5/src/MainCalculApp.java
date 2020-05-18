import java.util.Scanner;

public class MainCalculApp {
	
	@SuppressWarnings("unused")
	private int i;
	@SuppressWarnings("unused")
	private double a;
	private static double somme;

	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre application de calcul");
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Donnez le chiffre "+ i +" : ");
			double a =scan.nextDouble();
			somme = somme + a; 
		}
		System.out.println("La somme est : " + somme);
	}

}
