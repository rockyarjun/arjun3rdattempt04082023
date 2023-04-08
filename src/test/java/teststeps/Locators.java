package teststeps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Locators in selenium
		//ID -- (By.id("id element")) is the syntax
		//XPATH --(By.name("name element"))
		//CSS SELECTOR --
		//NAME --
		//CLASS NAME --whenever we see space between class name consider that as two classes not only one (By.className("classname"))
		//TAG NAME --
		//LINK TEXT --(By.linkText("link text")); is the syntax
		//PARTIAL LINK TEXT --
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//syntax is driver.manage().timeouts().implicitlyWaity(Duration.ofSeconds();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	    driver.findElement(By.name("inputPassword")).sendKeys("rocky123");
	    driver.findElement(By.className("signInBtn")).click();
	    //CSS selector--
	    // if classname is there then the syntax will be (By.cssSelector("tagname.classname"))
	    //if id is there then the syntax will be (By.cssSelector("tagname#idelement"))
	    // generic CSS syntax is Tagname[attriute='value']
	  System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	  //.getText method is used to get the text from the element 
	  driver.findElement(By.linkText("Forgot your password?")).click();
	  
	  
	  
//types of waits
//implicit wait--it is a dynamic wait : here the driver ultimately waits for time specified but if the object is found within the time specified then it will continue
	  //Xpath syntax here is : //Tagname[@attribute='value']
	  driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rocky");
	  //for xpath alsowe need to use double inverted comma for the locators
	  driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rockyarjun");
	  //in order tpo clear a searchbox or anything we need to use .clear() method;
	  driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	  
	    
	}

}