package JavaPrograms;
class Test
{
	public void show(int a) {
		System.out.println("I from class test1");
	}
}
class Test2
{
	public void show(int a) {
		System.out.println("I from class test3");
	}
}
public class polymorphismOverloading {

	public static void main(String[] args)
	{
		Test2 test=new Test2();
		test=new Test2();
		test.show(0);
				
				
				
				
		
	}

}
