import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		System.out.println("Nombre premier - Nombre non premier");
		
		int n, s = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entrer le nombre : ");
		n = scan.nextInt();
		
		for (int i =1; i <= n/2; i++) {
			
			if (n%i==0) {
				s=s+i;
			}
		}
		if (s==n) {
			System.out.println("Le nombre "+ n +" est parfait");
		} else {
			System.out.println("Le nombre "+ n +" n'est pas parfait");
		}
		

	}

}
