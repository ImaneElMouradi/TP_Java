

public class TestArticle {

	public static void main(String[] args) {
		Article a = new Article();
		Article a2 = new Article(1,"Pomme",10,100);
		Article a3 = new Article(a);
		
		System.out.println(a.getNum());
		System.out.println(a.getNom());
		System.out.println(a.prixTTC());
		System.out.println(a.getQte());	
		
		System.out.println(a2.getNom());
		System.out.println(a3.getNom());
		
	}
}
