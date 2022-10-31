package JavaPrograms;

public class Vegitables implements  TestInterface
{
	
		


	@Override
	public void Vegaables() {
		System.out.println("Ladis Fingers");
		
	}



	@Override
	public void fruits() {
		System.out.println("banana");
		
	}



	@Override
	public void Masalapowder() {
		System.out.println("chicken masala");
		
	}



	@Override
	public void Denim() {
		System.out.println("Shirt and pant");
	}



	public static void main(String[] args)
	{
		TestInterface a=new Vegitables();
		a.Vegaables();
		a.fruits();
		a.Masalapowder();
		a.Denim();
	}
}



