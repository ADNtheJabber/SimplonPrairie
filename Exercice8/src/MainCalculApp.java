import java.util.Scanner;

public class MainCalculApp {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Bienvenue dans votre app");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Veuillez saisir a : ");
		int a = scan.nextInt();
		
		System.out.print("Veuillez saisir b : ");
		int b = scan.nextInt();
		
		System.out.print("Veuillez saisir c : ");
		int c = scan.nextInt();
		
		System.out.println("l\'equation est : "+ a +"x2 + "+ b +"x +"+ c);
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		if (delta>0) {
			double x1 = (-b - Math.sqrt(delta))/2*a;
			
			double x2 = (-b + Math.sqrt(delta))/2*a;
			
			System.out.println("delta = "+ delta +" ==> Les solutions sont : x1 = "+ x1 +"----- x2 = "+ x2);
			
		}
		if (delta == 0) {
			double x0 = (-b)/2*a;
			
			System.out.println("delta = "+ delta +" ==> La solution unique est : "+ x0);
		} else {
			System.out.println("Delta est negatif, l'equation n'admet pas de solution reelle");
		} 
		

	}

}
