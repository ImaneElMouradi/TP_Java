
public class ArticleLuxe extends Article {
	
	public ArticleLuxe(int num, String nom, double prixHT, int qte) {
		super(num,nom,prixHT,qte);
	}
	public double prixTTC() {
		return prixHT * 1.25;
	}
	
}
