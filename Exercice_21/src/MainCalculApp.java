import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {

		int nb,x,i=0;
		
		System.out.println("Bienvenue dans votre App-GuessNumber");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Donner le nombre à deviner : ");
		nb = scan.nextInt();
		
		System.out.print("Entrer le nombre : ");
		x = scan.nextInt();
		
		while (nb != x) {
				
			i = i+1;
			
			if (x>nb) {
				System.out.print("Entrer un nombre plus petit : ");
				x = scan.nextInt();
			} 
			if (x<nb) {
				System.out.print("Entrer un nombre plus grand : ");
				x = scan.nextInt();
			} 
			
		}
			System.out.println("Bravo, vous avez trouvé le nombre à deviner "+ nb +" en "+ i +" tentatives");
	}

}
