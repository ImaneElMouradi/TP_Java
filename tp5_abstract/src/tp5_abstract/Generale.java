package tp5_abstract;

abstract public class Generale {
	protected int x=2;         // x variable d'instance (non consid�r�e static)     
	abstract public void qui();  // methode abstraite � implementer par les sous-classes  
	
	public void moi(){        
		System.out.println("Methode g�n�rale");
		}
}
