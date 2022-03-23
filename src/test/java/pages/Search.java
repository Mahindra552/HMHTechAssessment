package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class Search {

    @FindBy (xpath="//a[@class='orbit-search__button'][contains(.,'Search BBC')]")
    private WebElementFacade searchButton;

    @FindBy (xpath="//input[contains(@placeholder,'Search the BBC')]")
    private WebElementFacade searchTerm;


    public void clickOnSearchButton()
    {
        searchButton.waitUntilVisible();
        searchButton.click();
    }

    public void searchForTerm()
    {
        searchTerm.waitUntilVisible();
        searchTerm.sendKeys("Houghton Mifflin Harcourt");
    }
}
