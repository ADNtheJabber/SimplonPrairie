import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre application de Calcul");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le rayon r : ");
		int r = scan.nextInt();
		
		
		if(r!=0) {
			
			Calcul calcul = new Calcul();
			
			System.out.println("r = "+ r);
			System.out.println("Le periemtre est : " + calcul.calculPerimetre(r));
			System.out.println("Le reste est : "+ calcul.calculSurface(r));
						
		} else {
			System.out.println("Saisissez une valeur de r differente de 0");
		}
		
		
		
	}

}
