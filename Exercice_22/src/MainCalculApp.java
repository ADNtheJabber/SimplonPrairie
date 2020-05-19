import java.util.Scanner;

public class MainCalculApp {

	public static void main(String[] args) {
		
		int db,fn,l,j,n,k;
		int tab[]=new int [50];

		System.out.println("Bienvenue dans votre App");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("entrer la valeur de N (la taille du tableau) : ");
		n = scan.nextInt();
		
		while (n<10 || n>50) {
			System.out.println("N doit etre compris entre 1 et 50");
			n = scan.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			System.out.print("Entrer la valeur a l'indice "+ i +" : ");
			tab[i] = scan.nextInt();
			
			while (tab[i]<1 || tab[i]>100) {
				System.out.println("vous devez entrer un nombre compris entre 1 et 100");
				tab[i] = scan.nextInt();
			}
		}
		
		db = 0;
		fn = 0;
		l = 0;
		
		for (int i = 1; i <= n-1; i++) {
			k = i;
			j = i+1;
			
			while (tab[k]<tab[j] || j<=n) {
				k++;
				j++;
			}
			if (j-i>l) {
				db = i;
				fn = k;
				l = j-i;
			}
			i = k;
		}
		System.out.print("La sequence la plus longue est : ");
		for (int i = db; i <= fn ; i++) {
			System.out.print(tab[i] +"-");
		}
		System.out.print("Il debute à : "+ db +" et sa longueur est : "+ l);
		
	}

}
