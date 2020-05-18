
public class Calcul {
	@SuppressWarnings("unused")
	private int n;
	@SuppressWarnings("unused")
	private float x;
	private int power;
	
	public int calculPuissance(float x, int n) {
		power = (int) Math.pow(x, n);
		return power;
	}
}
