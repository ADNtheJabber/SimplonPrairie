
public class Calcul {
	@SuppressWarnings("unused")
	private int a,b;
	private int quotient;
	private int reste;
	private double ratio;
	
	public int calculQuotient(int a, int b) {
		quotient = (a/b);
		return quotient;
	}
	public int calculReste(int a, int b) {
		reste = (a%b);
		return reste;
	}
	public double calculRatio(int a, int b) {
		ratio = (100*a)/b;
		return ratio;
		
	}
	
}
