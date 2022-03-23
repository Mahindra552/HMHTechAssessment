package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy (xpath ="(//span[contains(.,'Home')])[1]")
    private WebElementFacade homeLink;


    public void clickOnHomeLink()
    {
        homeLink.waitUntilVisible();
        homeLink.click();
    }

}
