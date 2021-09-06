package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
    protected WebDriver driver;

    protected final int WAIT_TIMEOUT_SECONDS = 10;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void waitingVisibilityOfElement(WebElement... elements) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    protected void waitingForPageLoad() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(CustomExpectedConditions.jQueryAJAXsCompleted());
    }

    public void clickingOnAppearedElement(WebElement element) {
        waitingVisibilityOfElement(element);
        element.click();
    }

    public WebElement waitingVisibilityOfElement(String locator, String text) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(locator,text))));
    }
}
