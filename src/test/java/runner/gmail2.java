package runner;

import org.testng.annotations.Test;

public class gmail2 {
	
	public String name= "Mahesh";
	@Test
	public String getString()
	{
		if(name=="Mahesh")
		{
			System.out.println("OK");
				}
		else
		{
			System.out.println("The name entered is wrong");
		}
		return name;
	}

}
