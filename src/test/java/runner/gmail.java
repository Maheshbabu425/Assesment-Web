package runner;

import org.testng.annotations.Test;

public class gmail {
	@Test
	public void checkGmail2()
	{
		gmail2 g2 = new gmail2();
		g2.getString();
	}
	
	@Test
	public void checkGmail3()
	{
		gmail3 g3 = new gmail3();
		g3.getInt();
				
	}
}
