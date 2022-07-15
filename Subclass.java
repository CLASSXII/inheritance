public class Subclass extends Base
{
public void showDetails(  )
	{
		System.out.println("sub class");
		super.showDetails();
	}



	public static void main(String[] args)
	{
	     Subclass su= new Subclass();
	     
	     su.showDetails();
	   }
}