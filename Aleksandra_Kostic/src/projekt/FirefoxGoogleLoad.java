package projekt;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxGoogleLoad {
	 @Test
	  public void testGoogleSearch() throws InterruptedException {

	    System.setProperty("webdriver.gecko.driver","./geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://localhost:4200/");
	    Thread.sleep(5000); 
	    
	    driver.quit();
	  }

}
