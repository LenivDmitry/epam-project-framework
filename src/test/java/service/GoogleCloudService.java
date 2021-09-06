package service;

import org.openqa.selenium.WebDriver;
import page.hardcore.GoogleCloudPage;
import page.hardcore.GoogleCloudPlatformPricingCalculator;

public class GoogleCloudService {
    private String googleCloudPlatformPricingCalculator = "Google Cloud Platform Pricing Calculator";

    public GoogleCloudPlatformPricingCalculator openGoogleCloudPlatformPricingCalculatorPage(WebDriver driver) {
        return new GoogleCloudPage(driver).openPage()
                .searchInGoogleCloud(googleCloudPlatformPricingCalculator)
                .chooseGoogleCloudPlatformPricingCalculator();
    }
}
