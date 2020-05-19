import java.util.Scanner;

public class MainAppCoding {

	public static void main(String[] args) {

		int c,m,d;
		int tab[] = new int [10];
		
		System.out.println("Welcome");
		
		c = 1;
		d = 1;
		m = 1;
		
		Scanner scan =new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Entrer une valeur : ");
			tab[i] = scan.nextInt();
		}
		for (int i = 1; i <= 10; i++) {
			if (tab[i]<tab[i+1]) {
				d = 0;
				m = 0;
			} 
			if (tab[i]>tab[i+1]) {
				c = 0;
				m = 0;
			} 
			if (tab[i] == tab[i+1]) {
				c = 0;
				d = 0;
			}
		}
		if (c == 1) {
			System.out.println("Ordre croisant");
		}
		if (d == 1) {
			System.out.println("Ordre decroissant");
		}
		if (m == 1) {
			System.out.println("Constant");
		}
	}

}
