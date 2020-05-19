import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		
		int j,m,a;
		
		System.out.println("Bienvenue sur App-Date");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Donner le jour : ");
		j = scan.nextInt();
		
		System.out.print("Donner le mois : ");
		m = scan.nextInt();
		
		System.out.print("Donner l'annee : ");
		a = scan.nextInt();
		
		if (m>12 || j<0 || j>31 || a<0) {
			System.out.println("Date invalide");
		} else {
			if (m%2 != 0 && m<=7 || m%2 == 0 && m>7) {
				if (j>31) {
					System.out.println("Date Valide");
				} else {
					System.out.println("Date invalide");
				}
				
			} else {
				if (m!=2) {
					if (j>30) {
						System.out.println("Date invalide");
					} else {
						System.out.println("Date Valide");
					}
				} else {
					if (a%400 == 0 || a%4 == 0 && a%100 != 0) {
						if (j<=29) {
							System.out.println("Date Valide");
						} else {
							System.out.println("Date invalide");
						}
					} else {
						if (j>28) {
							System.out.println("Date invalide");
						} else {
							System.out.println("Date Valide");
						}
					}
				}
			}
		}
	}

}
