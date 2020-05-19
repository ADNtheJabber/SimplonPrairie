import java.util.Scanner;

public class MainCalculApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Bienvenue dans votre app");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entrer la valeur de a : ");
		int a = scan.nextInt();
		
		System.out.print("Entrer la valeur de b : ");
		int b = scan.nextInt();
		
		System.out.print("Entrer la valeur de c : ");
		int c = scan.nextInt();
		
		int z;
		
		Calcul calcul = new Calcul();
		
		if (a>b) {
			z = a;
			a = b;
			b = z;
		}
		
		System.out.println("L'ordre croissant est : "+ a +" , "+ b +" , "+c);

	}

}
