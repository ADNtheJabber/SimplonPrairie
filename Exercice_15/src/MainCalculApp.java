import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		
		int n,s;
		double moyenne;
		
		System.out.println("Bienvenue dans votre app");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entrer un nombre : ");
		n = scan.nextInt();
		
		while (n<0) {
			System.out.println("Vous devez un nombre positif et different de 0");
		}
		s = 0;
		moyenne = 0;
		
		for (int i = 1; i <= n; i++) {
			s = s +i;
		}
		moyenne = s/n;
		
		System.out.println("La somme des nombres de 1 à "+ n +" est : "+ s +"\nLa moyenne des nombres de 1 à "+ n +" est : "+ moyenne );

	}

}
