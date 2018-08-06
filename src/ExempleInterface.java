
// l'interface s'est l'ensemble 
// des signatures des méthodes communes de l'application
public interface ExempleInterface 
{
	// la signature de la méthode minimum
	public int minimum();
	
	// la signature de la méthode maximum
	public int maximum();
	
	// signatures des méthodes getters et setters communes
	public int getV1();
	public int getV2();
	
	public void setV1(int v1);
	public void setV2(int v2);
}