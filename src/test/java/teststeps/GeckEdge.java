package teststeps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver","C:\\Browser driver\\geckodriver.exe" );
		//just replace the path to firefox path
		//here we are invoking the webdriver.geckodriver and assigniong the fiefox path to it
		//firefox driver = Geckodriver
		WebDriver driver = new FirefoxDriver();
		
	}

}
