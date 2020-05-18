import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre application de Calcul");
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir R1 : ");
		int R1 = scan.nextInt();
		
		
		System.out.println("Veuillez saisir R2: ");
		int R2 = scan.nextInt();
		 
		System.out.println("Veuillez saisir R3: ");
		int R3 = scan.nextInt();
		
		
			Calcul calcul = new Calcul();
			
			System.out.println("R1 = "+ R1 +" -- R2 = "+ R2 +" -- R3 = "+ R3 +"");
			System.out.println("La resistance equivalente en serie est : " + calcul.calculReqSerie(R1, R2, R3));
			System.out.println("La resistance equivalente en parallele est : "+ calcul.calculReqParallele(R1, R2, R3));
				
		
	}

}
