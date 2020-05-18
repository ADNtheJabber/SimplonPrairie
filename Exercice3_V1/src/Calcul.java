
public class Calcul {
	private int R1,R2,R3;
	private double ReqSerie, ReqParallele;
	
	public double calculReqSerie(int R1, int R2, int R3) {
		ReqSerie = Math.round(R1+R2+R3);
		return ReqSerie;
	}
	public double calculReqParallele(int R1,int R2, int R3) {
		ReqParallele = Math.round((R1*R2*R3) / (R1*R2+R1*R3+R2*R3));
		return ReqParallele;		
	}
}
