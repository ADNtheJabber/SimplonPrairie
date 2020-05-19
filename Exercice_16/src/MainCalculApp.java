import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		
		int a,b,q,r;

		System.out.println("Bienvenue dans votre App");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Donner la valeur de a : ");
		a = scan.nextInt();
		
		System.out.print("Donner la valeur de b : ");
		b = scan.nextInt();
		
		q = 0;
		r = a;
		
		while (r>=b) {
			r = r-b;
			q++;
		}
		System.out.println("La division de "+ a +" par "+ b +" donne : "+ q +" et le reste est : "+ r );
	}

}
