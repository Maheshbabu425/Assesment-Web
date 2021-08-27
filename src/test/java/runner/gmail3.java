package runner;

import org.testng.annotations.Test;

@Test
public class gmail3 {

	public int num;

	public int getInt() {
		if (num == 9) {
			System.out.println("Ok");
		}
		return num;
	}

	@Test
	public void ckeckInt() {
		int value = 9;
		if (value % 2 == 0) {
			System.out.println("The declared int is even number");
		} else {
			System.out.println("Declared int is odd number");
		}
	}

	@Test
	public void arrayLoop() {
		int i;
		//int[] numbers = { 1, 2, 3, 4, 5 };
		for (i = 1; i <= 5; i++) {
			System.out.println(i);
		}

	}

	public void swithStrign() {
		String str = "three";
		switch (str)

		{
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("There is no string");

		}

	}
	
	public void switchInt()
	{
		int day=2;
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekend");
			
		}
	}

}
