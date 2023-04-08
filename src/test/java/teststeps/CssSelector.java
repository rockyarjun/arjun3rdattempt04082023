package teststeps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//CSS selector
	    //xpath-if the attribute in the xpath is same for multiple element then use index method
		// //Tagname[@attribute='value'][index]
		//Index method in CSS, syntax: Tagname[attribute='value']:nth-child[index]
		// parent child xpaths
		// Synntax :   // parenttag/childtag
		//Indexed parent child xpath :// parenttag/childtag[index]
		// using CSS selector without tagname also we can do example .classname or #Idelement
		
		System.setProperty("webdriver.chrome.driver","C:\\Browser driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//syntax is driver.manage().timeouts().implicitlyWaity(Duration.ofSeconds();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	    driver.findElement(By.name("inputPassword")).sendKeys("rocky123");
	    driver.findElement(By.className("signInBtn")).click();
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    // Thread is a class we can use methods inside it
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rocky");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("7760995165");
        //CSS parent child syntax:	  
	    // Syntax : parenttag childtag
	    //for angular transition pages give waits
	    driver.findElement(By.xpath("//div/button[2]")).click();
	    // how to use regular expressions in CSS and xpath( nothing but contains)
	    //CSS syntax : Tagname[attriute*='part of constant value'];
	    //Xpath syntax : // tagname[contains(@attribute,'part of constant value')];
	    driver.findElement(By.xpath("//button[contains(@class,'go-to')]")).click();
	    //clubbed xpath also we can write
	    // syntax: //parenttagname[@attribute ='value']/childtagname[index]
	    //in order to avoid interception problem we need to use wait
	    //
	    
	    
		

	}

}
