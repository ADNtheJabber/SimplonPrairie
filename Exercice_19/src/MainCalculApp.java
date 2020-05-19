import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		
		int s,n;
		
		System.out.println("Bienvenue dans App-Price");
		
		Scanner scan = new Scanner(System.in);
		
		s = 0;
		n = 0;
		do {
			System.out.print("Veuillez donner le prix : ");
			n = scan.nextInt();
			
			s = s + n;
			
		} while (n != 0);
		System.out.println("Le prix global est : "+ s);
	}

}
