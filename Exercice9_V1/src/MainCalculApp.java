import java.util.Scanner;

public class MainCalculApp {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Bienvenue dans votre app");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Veuillez entrer l'heure de depart : ");
		int hd = scan.nextInt();
		
		System.out.print("Veuillez entrer la minute de depart : ");
		int md = scan.nextInt();
		
		System.out.print("Veuillez entrer l'heure d'arrivee : ");
		int ha = scan.nextInt();
		
		System.out.print("Veuillez entrer la minute d'arrivee : ");
		int ma = scan.nextInt();
		
		int h1 = hd*60 + md;
		int h2 = ha*60 + ma;
		int dif = h2 - h1;
		
		System.out.println("\nLa duree du vol est : "+ dif/60 +" heure(s) et "+ dif%60 +" minutes");

	}

}
