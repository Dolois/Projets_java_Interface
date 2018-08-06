
public class Application {

	public static void main(String[] args)
	{
		// créer une instance note de la classe ImplInterface1
		ImplInterface1 note = new ImplInterface1();
		note.setV1(14);
		note.setV2(12);
		
		// afficher la note mini et la note maxi
		System.out.println("Note mini : " + note.minimum());
		System.out.println("Note maxi : " + note.maximum());
		
		note.setV1(17);
		note.setV2(20);
		
		System.out.println();
		System.out.println("Note mini : " + note.getV1());
		System.out.println("Note maxi : " + note.getV2());
		
		ImplInterface2 taille = new ImplInterface2();
		taille.setV1(173);
		taille.setV2(183);
		taille.setV3(188);

		System.out.println();
		System.out.println("la taille max est de : " + taille.maximum() + " cm .");
	}
}
