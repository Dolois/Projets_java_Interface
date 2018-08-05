
public class Application {

	public static void main(String[] args)
	{
		ImplInterface1 note = new ImplInterface1();
		note.v1 = 14;
		note.v2 = 12;
		
		// afficher la note mini et la note maxi
		System.out.println("Note mini : " + note.minimum());
		System.out.println("Note maxi : " + note.maximum());
		
		ImplInterface2 taille = new ImplInterface2();
		taille.v1 = 173;
		taille.v2 = 183;
		taille.v3 = 188;

		System.out.println("la taille max est de : " + taille.maximum() + " cm .");
	}

}
