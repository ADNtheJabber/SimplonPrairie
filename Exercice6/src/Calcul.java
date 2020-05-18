
public class Calcul {
	private int x1,x2,y1,y2;
	private double distance;
	
	public double calculDistance(int x1, int x2, int y1, int y2) {
		distance = Math.sqrt(Math.pow(Math.abs(x1-x2), 2) + Math.pow(Math.abs(y1-y2), 2));
		return distance;
	}

}
