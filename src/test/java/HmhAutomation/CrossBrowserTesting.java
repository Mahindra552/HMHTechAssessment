package HmhAutomation;

import com.beust.jcommander.Parameter;
import org.apache.hc.core5.reactor.Command;
import org.assertj.core.internal.bytebuddy.build.Plugin;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

import static org.testng.TestRunner.PriorityWeight.priority;

public class CrossBrowserTesting {

    WebDriver driver;

    //Cross browser testing using TestNg

    @Parameters("browser") // Here it will pickup the parameters given in XML file


@BeforeMethod
    public void CrossBrowser(String browser) {

        switch (browser.toLowerCase()){

            case "chrome":
            System.out.println("chrome");

            System.setProperty("webdriver.chrome.driver", "C://HmhTechAssessment//chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.manage().window().maximize();
            break;


            case "firefox":

            System.out.println("firefox");

            System.setProperty("webdriver.gecko.driver", "C://HmhTechAssessment//geckodriver.exe");

            driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.manage().window().maximize();
            break;

            case "ie":

            System.out.println("IE");

            System.setProperty("webdriver.ie.driver", "C://HmhTechAssessment//IEDriverServer.exe");

            driver = new InternetExplorerDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.manage().window().maximize();
            break;

            default:
            driver = null;
            break;

        }
    }

    //priority=1
    @Test()
    public void launchWebsiteUrl()
    {
        //Launch the BBC website Url
        driver.get("https://www.bbc.com/");

        //Maximize the Page (Full window Screen)
        driver.manage().window().maximize();
    }

    //priority=2
    @Test
    public void clickOnSportSection()
    {
        //click on Sports section
        driver.findElement(By.xpath("(//span[contains(.,'Sport')])[1]")).click();
        driver.navigate().back();
    }

    //priority=3
    @Test
    public void clickOnNewsSection()
    {
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
    }

   @AfterMethod
    public void tearDown() throws IOException {

       // this will quit your browser after execution

        driver.quit();

    }
}


