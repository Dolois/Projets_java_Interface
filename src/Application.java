
public class Application {

	public static void main(String[] args)
	{
		ImplInterface1 int1 = new ImplInterface1();
		
		int1.v1 = 14;
		int1.v2 = 12;
		
		System.out.println(int1.minimum());
		System.out.println(int1.maximum());
		

	}

}
