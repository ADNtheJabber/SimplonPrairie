
public class Calcul {
	
	private int a,b,c,x,y,z;
	
	public double compare(int x, int y) {
		if (x>y) {
			z = x;
			x = y;
			y = z;
		}
		return x;
	}
}
