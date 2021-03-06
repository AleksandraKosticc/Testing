package test;
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UpdateStudentMailTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void updateStudentMail() {
    driver.get("http://localhost:4200/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.linkText("Add Student")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Aleksandra");
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("aleksandra.kosticc@gmail.com");
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'B-Tech']")).click();
    }
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.linkText("View Student")).click();
    driver.findElement(By.cssSelector(".btn-info")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).click();
    driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[1]/input")).sendKeys("Marko");
    driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).click();
    driver.findElement(By.cssSelector(".form-group:nth-child(3) > .form-control")).sendKeys("marko.markovic@gmail.com");
    driver.findElement(By.cssSelector(".ng-untouched:nth-child(2)")).click();
    {
      WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[2]/div/div/form/div[2]/div[1]/div[3]/select"));
      dropdown.findElement(By.xpath("//option[. = 'MCA']")).click();
    }
    driver.findElement(By.cssSelector(".form-control > option:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.cssSelector(".btn-danger")).click();
    assertThat(driver.findElement(By.cssSelector("td:nth-child(1)")).getText(), is("Marko"));
    assertThat(driver.findElement(By.xpath("/html/body/app-root/div/app-student-list/div[1]/div[2]/div/table/tbody/tr/td[2]")).getText(), is("marko.markovic@gmail.com"));
  }
}
