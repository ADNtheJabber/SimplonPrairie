
public class Calcul {
	@SuppressWarnings("unused")
	private int r;
		
	public double calculPerimetre(int r) {
		double perimetre = Math.round(8*r*Math.atan(1));
		return perimetre;
	}
	public double calculSurface(int r) {
		double surface = Math.round(4*r*r*Math.atan(1));
		return surface;
	}
	
}