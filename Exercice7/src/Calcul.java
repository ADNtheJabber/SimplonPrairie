
public class Calcul {
	private int billet20, billet10, billet5, piece2, piece1, montant, reste;
	
	public void calculDecomposition(int montant) {
		
		reste = montant;
		
		
			billet20 = (reste/20);
			reste = reste % billet20;
			
			billet10 = (reste/10);
			reste = reste % billet10;
			
			billet5 = (reste/5);
			reste = reste % billet5 ;
			
			piece2 = (reste/2);
			reste = reste % piece2;
			
			piece1 = reste;
				
		
		System.out.println("Votre montant : "+montant+"\nBillets de 20 euros : "+billet20+"\nBillets de 10 euros : "+billet10+
				"\nBillets de 05 euros : "+billet5+"\nPieces de 02 euros : "+piece2+"\nPieces de 01 euros : "+piece1);
		
	}
}
