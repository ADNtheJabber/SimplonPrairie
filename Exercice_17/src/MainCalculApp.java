import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {

		int a,b,c,d;
		
		System.out.println("Bienvenue dans votre app-PGCD");

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Donner a : ");
		a = scan.nextInt();
		
		System.out.print("Donner b : ");
		b = scan.nextInt();
		
		c = a;
		d = b;
		
		while (c != d) {
			if (c>d) {
				c = c - d;
			} else {
				d = d - c;
			}
		}
		
		System.out.println("Le PGCD de "+ a +" et "+ b +" est : "+ c);
	}

}
