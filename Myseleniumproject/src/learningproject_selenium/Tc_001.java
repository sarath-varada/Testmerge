package learningproject_selenium;

import java.io.IOException;

public class Tc_001 extends Base_Test
{
	
	public static void main(String[] args) throws IOException 
	{
		init();
		launch("chromebrowser");
		navigateurl("amazonurl");
		driver.quit();
	}
}
