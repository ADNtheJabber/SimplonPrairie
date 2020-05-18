
public class Calcul {
	@SuppressWarnings("unused")
	private int i,n;
	@SuppressWarnings("unused")
	private float x;
	private float power;
	
	public float calculPuissance(float x, int n) {
	
		if (n==0) {
			power = 1;
		}else {
			for (int i = 1; i < Math.abs(n); i++) {
				power = power*x;
			}
			if (n<0) {
				for (int i = 1; i < Math.abs(n); i++) {
					power = 1/(power*x);
				}
				
			}
		}
		return power;
	}
}
