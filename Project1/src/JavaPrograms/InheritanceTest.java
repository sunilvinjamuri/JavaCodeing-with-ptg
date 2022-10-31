package JavaPrograms;
class State
{
	public void City()
	{
		System.out.println("my city is guntur");
	}
}
	class Town extends State
	{
		public void Town()
		{
			System.out.println("my Town is Gurazala");
		}
	}
	

public class InheritanceTest {

	public static void main(String[] args)
{
		State Aobj=new State();
		Aobj.City();
		//Aobj.Town();
		
	}

}
