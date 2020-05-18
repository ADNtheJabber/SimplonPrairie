import java.util.Scanner;

public class MainCalculApp {
	
	
	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre application de calcul");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saisir les coordonnees de A : \nx1 = ");
		int x1 = scan.nextInt();
		
		System.out.println("y1 = ");
		int y1 = scan.nextInt();
		
		System.out.println("Saisir les coordonnees de B : \nx2 = ");
		int x2 = scan.nextInt();
		
		System.out.println("y2 = ");
		int y2 = scan.nextInt();
		
		Calcul  calcul = new Calcul();
		
		System.out.println("La distance entre A et B est : " + Math.round(calcul.calculDistance(x1, x2, y1, y2)) );
	}

}
