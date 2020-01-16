package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Jumia {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Jumia\\ChromeServer\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.jumia.com.ng/");
	    driver.manage().window().maximize();
	    
	    TakesScreenshot tk=(TakesScreenshot)driver;
	    File source=tk.getScreenshotAs(OutputType.FILE);
	    File dest=new File("E:\\Eclipse\\Jumia\\ScreenShots\\BrowserLaunch.png");
	    FileUtils.copyFile(source, dest);
	    
try 
    {
        Thread.sleep(5000);
	    WebElement close = driver.findElement(By.xpath("(//button[@class='cls -fs0'])[2]"));
	    close.click();
	} 
catch (Exception e) 
    {
		Thread.sleep(2000);
	    WebElement closeTopPage = driver.findElement(By.xpath("(//button[@class='cls -fs0'])[1]"));
	    closeTopPage.click();
	//Select electronics using Mouseover Action
	    WebElement electronicsSelect = driver.findElement(By.xpath("//span[text()='Electronics']"));
	    Actions acc=new Actions(driver);
	    acc.moveToElement(electronicsSelect).perform();
    //Select DigitalCamera
	    Thread.sleep(3000);
	    WebElement digitalCamera = driver.findElement(By.xpath("//a[text()='Digital Cameras']"));
	    digitalCamera.click();
	//Tick Brand CheckBox Canon
	    Thread.sleep(1000);
	    WebElement brandChkBoxCanon = driver.findElement(By.xpath("(//i[@class='osh-font-checkbox -checkbox-toggle'])[3]"));
	    brandChkBoxCanon.click();
	//Price From   
	    Thread.sleep(1000);
	    WebElement priceFrom = driver.findElement(By.xpath("(//input[@name='price_from'])[2]"));
	    priceFrom.click();
	    Robot r=new Robot();
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_BACK_SPACE);
	    r.keyRelease(KeyEvent.VK_BACK_SPACE);
	    Thread.sleep(1000);
	    priceFrom.sendKeys("20000");
	//Price To    
	    Thread.sleep(1000);
	    WebElement priceTo = driver.findElement(By.xpath("(//input[@name='price_to'])[2]"));
	    priceTo.click();
	       for (int i = 0; i < 3; i++) 
	       {
	  	     r.keyPress(KeyEvent.VK_RIGHT);
	  	     r.keyRelease(KeyEvent.VK_RIGHT);	
		   }
	       for (int i = 0; i < 7; i++) 
	       {
	    	  r.keyPress(KeyEvent.VK_BACK_SPACE);
	    	  r.keyRelease(KeyEvent.VK_BACK_SPACE);	
		   }
	    priceTo.sendKeys("100000");
	 //Go Button   
	    WebElement goBtn = driver.findElement(By.xpath("(//button[@class='osh-btn js-submit-filter'])[2]"));
	    goBtn.click();
	 //Sort Button Click   
	    WebElement sortbtn = driver.findElement(By.xpath("//button[@class='osh-btn -select-box ft-sort']"));
	    sortbtn.click();
	 //SortBy NewIn   
	    WebElement sortByNew = driver.findElement(By.xpath("//a[text()='New In']"));
	    sortByNew.click();
	 //Select Camera   
	    WebElement camSelect = driver.findElement(By.xpath("//span[text()='PowerShot SX540 HS Digital Camera']"));
	    camSelect.click();
	 //AddToCart   
	    Thread.sleep(1000);
	    WebElement addToCart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
	    addToCart.click();
	 //View And Checkout   
	    Thread.sleep(3000);
	    WebElement viewNChkOut = driver.findElement(By.xpath("//a[@class='btn _prim -mls -fw']"));
	    viewNChkOut.click();
	 //Proceed To Checkout   
	    Thread.sleep(1000);
	    WebElement proceedToChkOut = driver.findElement(By.xpath("//a[@class='osh-btn -primary -shadow ft-go-to-checkout']"));
	    proceedToChkOut.click();
	    }
	    
try {
		Thread.sleep(1000);
	    WebElement emailId = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	    emailId.sendKeys("angeljemi77@gmail.com");
	    
	    WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
	    password.sendKeys("Jemimachaan16");
	    
	    WebElement loginBtn = driver.findElement(By.xpath("//button[@class='btn _prim _i -mts']"));
	    loginBtn.click();
}
catch (Exception e) {
	System.out.println(e);
	Thread.sleep(10000);
	}
finally 
{
        Thread.sleep(2000);
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement proceedToChkOut1 = driver.findElement(By.xpath("//a[@class='osh-btn -primary -shadow ft-go-to-checkout']"));
	    js.executeScript("arguments[0].click()", proceedToChkOut1);
	    
	 // Address Details
	    Thread.sleep(2000);
	    WebElement mobileNum = driver.findElement(By.xpath("//input[@class='osh-input -full-width ft-phone1-text-field']"));
	    mobileNum.sendKeys("7845632200");
	    
	    WebElement address = driver.findElement(By.xpath("(//textarea[@class='osh-input -text-area'])[1]"));
	    address.sendKeys("73,Paul street,Obi,Delta");
	    
	    WebElement state = driver.findElement(By.xpath("//select[@class='osh-input -full-width']"));
	    Select s1=new Select(state);
	    s1.selectByVisibleText("Delta");
	    
	    WebElement city = driver.findElement(By.xpath("//select[@class='osh-input -full-width placeholder']"));
	    Select s2=new Select(city);
	    s2.selectByVisibleText("AGBOR - OBI");
	    
	    WebElement saveNCon = driver.findElement(By.xpath("//span[@class='label ']"));
	    saveNCon.click();

	}

}
}
