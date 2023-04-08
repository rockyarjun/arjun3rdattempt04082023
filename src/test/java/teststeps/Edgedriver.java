package teststeps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver","C:\\Browser driver\\edgedriver.exe");
		WebDriver driver = new EdgeDriver();
		// drivers can be downloaded from selenium.dev in under downloads
		//here we are invoking webdriver.edge.driver and assigning edge drive path to it
	}

}
