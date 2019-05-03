

public class Article {
	protected String nom;
	protected int num, qte;
	protected double prixHT;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}
	
	public Article() {
		super();
		this.nom ="specimen";
		this.num = 0;
		this.qte = 222;
		this.prixHT = 1;
	}

	public Article( int num, String nom, double prixHT, int qte) {
		super();
		this.nom = nom;
		this.num = num;
		this.qte = qte;
		this.prixHT = prixHT;
	}
	
	public Article(Article a) {
		super();
		this.nom = a.getNom();
		this.num = a.getNum();
		this.qte = a.getQte();
		this.prixHT = a.getPrixHT();
		
	}

	public double prixTTC() {
		return prixHT * 1.14;
	}
	
	public void ajouter(int q) {
		qte += q;
	}
	
	public void retirer(int q) {
		qte -= q;
	}
	
	
}
