package teststeps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teststeps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. jjava code will run under main class only
//2.Class is ChromeDriver in that so many methods will be there we just need to use them
//3.we need to create a object of the class in order to use the methods under that class
		//-syntax will be Classname anyname = new classname();
		// WebDriver is the interface can be used in place of ChromeDriver in startng to create a object of ChromeDriver class
		
		//ChromeDriver driver = new ChromeDriver();
	// as we are using some other class  of the package so we need to import it 
		// Chrome driver will be having its own methods that will not be required ,by using Webdriver in place of ChromeDriver in starting 
		//- so that we can use only WebDriver defined methods and reject ChromeDriver methods.
		// how to invoke chrome driver
		// by invoking webdriver.chrome.driver and assigning the path to it where the chrome driver is located
		// we need to match the driver version with Chrome
		// System is a class which gives us some important methods used in selenium
		System.setProperty("webdriver.chrome.driver", "C:\\Browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//the values inside the System.setProperty should be enclosed with double inverted comma
		//two backward slash will be used for directions
		//driver.get navigates us to the url
		driver.get("https://rahulshettyacademy.com");
		driver.getTitle(); //it is a method to get the title of the browser
		System.out.println(driver.getTitle());
		//methods can be printed directly by sysout
		System.out.println(driver.getCurrentUrl());//gets the current url
		driver.close();//closes the current window, and quitting te current browser if its the last window currently open 
		driver.quit();//closes the all the windows currently open
	}

}
