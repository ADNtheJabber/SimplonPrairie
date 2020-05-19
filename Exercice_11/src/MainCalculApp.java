import java.util.Scanner;

public class MainCalculApp {
	
	
	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre App");
		
		double a,b;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Veuillez saisir a : ");
		a = scan.nextInt();
		
		System.out.print("Veuillez saisir b : ");
		b = scan.nextInt();
		
			scan.nextLine();
			System.out.print("Veuillez saisir l'operateur : ");
			String choix = scan.nextLine();
			
			switch (choix) {
			case "+":
				System.out.println(a +" + "+ b +" = "+(a+b));
				break;
				
			case "-":
				System.out.println(a +" - "+ b +" = "+(a-b));
				break;
				
			case "*":
				System.out.println(a +" * "+ b +" = "+(a*b));
				break;
				
			case "/":
				if (b!=0) {
					System.out.println(a +" / "+ b +" = "+(a/b));
				} else {
					System.out.println("Division par 0 impossible");
				}
				
				break;

			default:
				
				System.out.println("Choix indisponible");
				break;
						
		} 
	}

}
