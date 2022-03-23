package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Navigation {

    @FindBy(xpath ="(//span[contains(.,'Sport')])[1]")
    private WebElementFacade sportLink;

    @FindBy (xpath ="(//span[contains(.,'News')])[1]")
    private WebElementFacade newsLink;

    public void clickOnSportLink()
    {
        sportLink.waitUntilVisible();
        sportLink.click();
    }

    public void clickOnNewsLink()
    {
        newsLink.waitUntilVisible();
        newsLink.click();
    }
}
