package cases;

import org.testng.annotations.Test;

public class case4 {

	public void Cars()
	{
		System.out.println("This Is Audi model");
	}
	
	@Test
	public void Defender()
	{
		Cars();
		System.out.println("This is Defender");
	}
}
