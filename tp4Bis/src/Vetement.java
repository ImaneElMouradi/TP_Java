
public class Vetement extends Article {
	
	private int taille;
	private String coloris;
		
	
	public Vetement(int num, String nom, double prixHT, int qte,  int taille, String coloris ) {
		super(num,nom,prixHT,qte);
		this.taille = taille;
		this.coloris = coloris;
	}
	
	
}
