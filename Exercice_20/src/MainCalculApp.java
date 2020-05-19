import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		
		int n,g,r;
		
		System.out.println("Welcome to App-Highest");
		
		Scanner scan = new Scanner(System.in);
		
		n = 0;
		g = 0;
		r = 1;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Saisir le nombre "+ i +" : ");
			n = scan.nextInt();
			
			if (n>g) {
				g = n;
				r = i;
			}
		}
		System.out.println("Le plus grand nombre saisi est : "+ g +" et son rang est : "+ r);
	}

}
