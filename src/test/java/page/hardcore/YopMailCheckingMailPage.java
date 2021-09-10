package page.hardcore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

public class YopMailCheckingMailPage extends AbstractPage {

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(css = "tr td:nth-child(2) > h3")
    private WebElement totalCost;
    @FindBy(xpath = "//div[@id='message']")
    private WebElement messageAboutEmptyMail;
    @FindBy(xpath = "//button[@id='refresh']")
    private WebElement buttonRefreshMail;


    protected YopMailCheckingMailPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTotalCost() {
        waitingVisibilityOfElement(messageAboutEmptyMail);
        while (messageAboutEmptyMail.getText().equals("Этот почтовый ящик пуст")){
            clickingOnAppearedElement(buttonRefreshMail);
            try {
                Thread.sleep(1000);
                logger.info(" Waited a second");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        driver.switchTo().frame("ifmail");
        waitingVisibilityOfElement(totalCost);
        return totalCost;
    }
}
