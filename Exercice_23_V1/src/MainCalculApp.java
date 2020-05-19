
public class MainCalculApp {

	public static void main(String[] args) {
		int n,nm = 0,nM = 0,c;
		
		System.out.println("Bienvenue dans votre App-Compteur");
		
		for (int i = 0; i <= 12; i++) {
			if (i==0) {
				nm=2;
				nM=0;
			} else {
				c = nM;
				nM = nM +nm;
				nm = c;
			}
		}
		System.out.println("Le nombre de lapins dans un an est : "+(nm+nM));

	}

}
