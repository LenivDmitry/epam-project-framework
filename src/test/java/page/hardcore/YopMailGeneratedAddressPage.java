package page.hardcore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

public class YopMailGeneratedAddressPage extends AbstractPage {

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//button[@id='cprnd']")
    private WebElement buttonCopyEmail;
    @FindBy(xpath = "//button[@onclick='egengo();']")
    private WebElement buttonCheckEmail;
    @FindBy(css = "tr td:nth-child(2) > h3")
    private WebElement totalCost;

    protected YopMailGeneratedAddressPage(WebDriver driver) {
        super(driver);
    }

    public void copyRandomEmail() {
        clickingOnAppearedElement(buttonCopyEmail);
    }

    public YopMailCheckingMailPage openCheckingEmailPage() {
        clickingOnAppearedElement(buttonCheckEmail);
        logger.info(" Opened Checking Email Page");
        return new YopMailCheckingMailPage(driver);

    }


}
