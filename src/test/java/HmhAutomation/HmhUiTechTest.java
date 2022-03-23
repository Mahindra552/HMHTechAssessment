package HmhAutomation;

import com.beust.jcommander.Parameters;
import com.beust.jcommander.Strings;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HmhUiTechTest {

    public static void main(String[] args)
    {
    WebDriver driver; //Create a global webdriver Interface

     //Print BBC Tech Assessment
     System.out.println("BBC Tech Assessment");

     //setProperty ChromeDriver path
     System.setProperty("webdriver.chrome.driver", "C://HmhTechAssessment//chromedriver.exe");

     //Launch the Chrome browser
      driver = new ChromeDriver();

     //Test can run on firefox browser

     /*//setProperty FirefoxDriver path
     System.setProperty(“webdriver.gecko.driver”, "C://HmhTechAssessment//geckodriver.exe”);"

             // Initialize Gecko Driver using Desired Capabilities Class
             DesiredCapabilities capabilities = DesiredCapabilities.firefox();
             capabilities.setCapability("marionette",true);

     firefoxDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver*/


     //Launch the BBC website Url
     driver.get("https://www.bbc.com/");

     //Maximize the Page (Full window Screen)
     driver.manage().window().maximize();

     //click on Sports section
     driver.findElement(By.xpath("(//span[contains(.,'Sport')])[1]")).click();

     //DateTimeFormatter dtf= new

     // Create object of SimpleDateFormat class and decide the format
     DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

     //get current date time with Date()
     Date date = new Date();

     // Now format the date
     String todayDate= dateFormat.format(date);

     // Print the Date
     System.out.println(todayDate);


     //browser arrow navigate to back

     driver.navigate().back();

     // click on News section

     driver.findElement(By.xpath("(//span[contains(.,'News')])[1]")).click();

     //get Current Page Url
     String CurrentPageUrl=driver.getCurrentUrl();

     //print the CurrentPageUrl
     System.out.println(CurrentPageUrl);

     //get Text from News Page
     String getNewsText = driver.findElement(By.xpath("(//span[contains(.,'News')])[1]")).getText();

     //Print the text
     System.out.println(getNewsText);


     // click on Search button

     driver.findElement(By.xpath("//a[@class='orbit-search__button'][contains(.,'Search BBC')]")).click();

     // Enter the search term "Houghton Mifflin Harcourt"
     driver.findElement(By.xpath("//input[contains(@placeholder,'Search the BBC')]")).sendKeys("Houghton Mifflin Harcourt");

    //click on Search icon

     WebElement searchButton = driver.findElement(By.name("q"));
     searchButton.click();

     //driver.findElement(By.xpath("(//span[contains(.,'Submit Search')]")).click();

     //driver.findElement(By.xpath("//input[contains(@id,'search-input')]")).click();
     //driver.findElement(By.xpath("//svg[contains(@viewBox,'0 0 32 32')]")).click();

    //scroll down the cursor on search results page
     JavascriptExecutor jse = (JavascriptExecutor) driver;
     jse.executeScript("window.scrollBy(0,250)", "");


     // Close the driver window
     driver.close();

 }
}

