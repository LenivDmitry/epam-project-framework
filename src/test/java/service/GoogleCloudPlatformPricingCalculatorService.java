package service;

import model.ComputeEngine;
import page.hardcore.EstimatePage;
import page.hardcore.GoogleCloudPlatformPricingCalculator;

public class GoogleCloudPlatformPricingCalculatorService {
    public EstimatePage costEstimateByValue(GoogleCloudPlatformPricingCalculator calculator,
                                            ComputeEngine computeEngine) {
        return calculator.goInTheFrame()
                .selectComputeEngineChapter()
                .fillingNumberOfInstance(computeEngine.getNumberOfInstance())
                .selectOperatingSystemOrSoftware(computeEngine.getOperatingSystemOrSoftware())
                .selectMachineClass(computeEngine.getMachineClass())
                .selectSeries(computeEngine.getSeries())
                .selectMachineType(computeEngine.getMachineType())
                .selectAddGPUs(computeEngine.getAddGPUs(),
                        computeEngine.getNumberOfGPUs(),
                        computeEngine.getTypeOfGPUs())
                .selectLocalSSD(computeEngine.getLocalSSD())
                .selectDatacenterLocation(computeEngine.getDatacenterLocation())
                .selectCommittedUsage(computeEngine.getCommittedUsage())
                .enterAddToEstimate();
    }
}
