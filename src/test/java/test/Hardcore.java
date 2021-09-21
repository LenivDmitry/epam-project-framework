package test;

import model.ComputeEngine;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.hardcore.EstimatePage;
import service.ComputeEngineCreator;
import service.GoogleCloudPlatformPricingCalculatorService;
import service.GoogleCloudService;

public class Hardcore extends CommonConditions {
    private GoogleCloudService googleCloudService = new GoogleCloudService();
    private GoogleCloudPlatformPricingCalculatorService calculatorService = new GoogleCloudPlatformPricingCalculatorService();
    private ComputeEngine computeEngine = ComputeEngineCreator.withCredentialsFromProperty();
    private EstimatePage estimatePage;

    @BeforeTest()
    public void browserSetup() {
        estimatePage = calculatorService.costEstimateByValue(
                googleCloudService.openGoogleCloudPlatformPricingCalculatorPage(driver), computeEngine)
                .sendEmailEstimateToRandomEmail();
    }

    @Test()
    public void compareTotalCostInEmail() {
        Assert.assertTrue(estimatePage.getTotalEstimatedCost().contains(estimatePage.getTotalCostFromMail()));
    }
}
