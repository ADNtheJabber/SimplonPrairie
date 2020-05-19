
public class MainCalculApp {

	public static void main(String[] args) {

		int i = 0,s = 0,c,nm = 0,nM = 0;
		
		while (s<=1000000000) {
			if (i==0) {
				nm = 2;
				nM = 0;
			} else {
				c = nM;
				nM = nM + nm;
				nm = c;
				
			}
			s = 2*nM +nm;
			i++;
		}
		System.out.println("C'est au bout de "+ i +" mois que le nombre de lapins depassera 1 Milliards");
		
	}

}
