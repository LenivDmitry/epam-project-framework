package page.hardcore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

public class GoogleCloudPlatformPricingCalculator extends AbstractPage {

    private final Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//md-tab-item/div[@title='Compute Engine']")
    private WebElement computeEngine;
    @FindBy(xpath = "//input[@ng-model='listingCtrl.computeServer.quantity']")
    private WebElement numberOfInstance;
    @FindBy(xpath = "//md-select[@ng-model='listingCtrl.computeServer.os']")
    private WebElement operatingSystemOrSoftware;
    private final String SELECTED_OPERATING_SYSTEM_OR_SOFTWARE = "//md-option[@class='md-ink-ripple']/div[contains(text(),'%s')]";
    @FindBy(xpath = "//md-select[@ng-model='listingCtrl.computeServer.class']")
    private WebElement machineClass;
    private final String SELECTED_MACHINE_CLASS = "//md-select-menu[@style] /descendant::div[contains(text(), '%s')]";
    @FindBy(xpath = "//md-select[@placeholder='Series']")
    private WebElement series;
    private final String SELECTED_SERIES = "//div[contains(text(), '%s')]";
    @FindBy(xpath = "//md-select[@placeholder='Instance type']")
    private WebElement machineType;
    private final String SELECTED_MACHINE_TYPE = "//div[@class='md-text ng-binding' and contains(text(),'%s')]";
    @FindBy(xpath = "//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']/div[@class='md-container md-ink-ripple']")
    private WebElement addGPUs;
    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']")
    private WebElement numberOfGPUs;
    private final String SELECTED_NUMBER_OF_GPU = "//md-select-menu[@style]//md-option[@value='%s']";
    @FindBy(xpath = "//md-select[@placeholder='GPU type']")
    private WebElement typeOfGPU;
    private final String SELECTED_TYPE_OF_GPU = "//div[@class='md-text ng-binding' and contains(text(),'%s')]";
    @FindBy(xpath = "//md-input-container[@class='md-input-has-placeholder md-input-has-value flex']/md-select[@placeholder='Local SSD']")
    private WebElement localSSD;
    private final String SELECTED_LOCAL_SSD = "//md-option/div[@class='md-text ng-binding' and contains(text(),'%s')]";
    @FindBy(xpath = "//md-input-container[@class]/md-select[@ng-model='listingCtrl.computeServer.location']")
    private WebElement datacenterLocation;
    private final String SELECTED_DATACENTER_LOCATION = "//md-select-menu[@class='md-overflow']//div[contains(text(), '%s')]";
    @FindBy(xpath = "//md-input-container//md-select[@aria-label='Committed usage: None']")
    private WebElement committedUsage;
    private final String SELECTED_COMMITTED_USAGE = "//md-select-menu[@style] /descendant::div[contains(text(), '1 Year')]";
    @FindBy(xpath = "//button[@ng-click='listingCtrl.addComputeServer(ComputeEngineForm);']")
    private WebElement addTOEstimate;

    public GoogleCloudPlatformPricingCalculator(WebDriver driver) {
        super(driver);
    }

    public GoogleCloudPlatformPricingCalculator goInTheFrame() {
        driver.switchTo().frame(0).switchTo().frame("myFrame");
        logger.info("Frame was switched");
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectComputeEngineChapter() {
        clickingOnAppearedElement(computeEngine);
        logger.info("Selected Compute Engine");
        return this;
    }

    public GoogleCloudPlatformPricingCalculator fillingNumberOfInstance(String numberAsString) {
        waitingVisibilityOfElement(numberOfInstance);
        numberOfInstance.sendKeys(numberAsString);
        logger.info(" Put number of instance " + numberAsString);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectOperatingSystemOrSoftware(String operatingSystemOrSoftwareName) {
        clickingOnAppearedElement(operatingSystemOrSoftware);
        waitingVisibilityOfElement(SELECTED_OPERATING_SYSTEM_OR_SOFTWARE, operatingSystemOrSoftwareName).click();
        logger.info("Selected operating System or Software: " + operatingSystemOrSoftwareName);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectMachineClass(String machineClassName) {
        clickingOnAppearedElement(machineClass);
        waitingVisibilityOfElement(SELECTED_MACHINE_CLASS, machineClassName).click();
        logger.info("Selected machine class: " + machineClassName);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectSeries(String seriesName) {
        clickingOnAppearedElement(series);
        waitingVisibilityOfElement(SELECTED_SERIES, seriesName).click();
        logger.info("Selected series: " + seriesName);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectMachineType(String machineTypeName) {
        clickingOnAppearedElement(machineType);
        waitingVisibilityOfElement(SELECTED_MACHINE_TYPE, machineTypeName).click();
        logger.info("Selected machine type: " + machineTypeName);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectAddGPUs(boolean value, String numberOfGPUsName, String typeOfGPUName) {
        if (value) {
            clickingOnAppearedElement(addGPUs);
            logger.info("add GPUs");
            selectNumberOfGPUs(numberOfGPUsName);
            selectTypeOfGPUs(typeOfGPUName);
        }
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectNumberOfGPUs(String numberOfGPUsName) {
        clickingOnAppearedElement(numberOfGPUs);
        waitingVisibilityOfElement(SELECTED_NUMBER_OF_GPU, numberOfGPUsName).click();
        logger.info("Selected number of GPUs: " + numberOfGPUsName);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectTypeOfGPUs(String typeOfGPUName) {
        clickingOnAppearedElement(typeOfGPU);
        waitingVisibilityOfElement(SELECTED_TYPE_OF_GPU, typeOfGPUName).click();
        logger.info("Selected type of GPUs: " + typeOfGPUName);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectLocalSSD(String localSSDName) {
        clickingOnAppearedElement(localSSD);
        waitingVisibilityOfElement(SELECTED_LOCAL_SSD, localSSDName).click();
        logger.info("Selected local SSD: " + localSSDName);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectDatacenterLocation(String datacenterLocationName) {
        clickingOnAppearedElement(datacenterLocation);
        waitingVisibilityOfElement(SELECTED_DATACENTER_LOCATION, datacenterLocationName).click();
        logger.info("Selectes datacenter location: " + datacenterLocationName);
        return this;
    }

    public GoogleCloudPlatformPricingCalculator selectCommittedUsage(String committedUsageName) {
        clickingOnAppearedElement(committedUsage);
        waitingVisibilityOfElement(SELECTED_COMMITTED_USAGE, committedUsageName).click();
        logger.info("Selected committed usage: " + committedUsageName);
        return this;
    }

    public EstimatePage enterAddToEstimate() {
        clickingOnAppearedElement(addTOEstimate);
        logger.info("Create Total Estimate");
        return new EstimatePage(driver);
    }
}
