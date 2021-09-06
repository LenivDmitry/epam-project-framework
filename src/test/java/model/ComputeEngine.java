package model;

import java.util.Objects;

public class ComputeEngine {
    private String numberOfInstance;
    private String operatingSystemOrSoftware;
    private String machineClass;
    private String series;
    private String machineType;
    private boolean isAddGPUs;
    private String numberOfGPUs;
    private String typeOfGPUs; //method
    private String localSSD;
    private String datacenterLocation;
    private String committedUsage;

    public ComputeEngine(String numberOfInstance, String operatingSystemOrSoftware, String machineClass,
                         String series, String machineType, Boolean isAddGPUs,
                         String numberOfGPUs, String typeOfGPUs, String localSSD,
                         String datacenterLocation, String committedUsage) {
        this.numberOfInstance = numberOfInstance;
        this.operatingSystemOrSoftware = operatingSystemOrSoftware;
        this.machineClass = machineClass;
        this.series = series;
        this.machineType = machineType;
        this.isAddGPUs = isAddGPUs;
        this.numberOfGPUs = numberOfGPUs;
        this.typeOfGPUs = typeOfGPUs;
        this.localSSD = localSSD;
        this.datacenterLocation = datacenterLocation;
        this.committedUsage = committedUsage;
    }

    public String getNumberOfInstance() {
        return numberOfInstance;
    }

    public String getOperatingSystemOrSoftware() {
        return operatingSystemOrSoftware;
    }

    public String getMachineClass() {
        return machineClass;
    }

    public String getSeries() {
        return series;
    }

    public String getMachineType() {
        return machineType;
    }

    public Boolean getAddGPUs() {
        return isAddGPUs;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public String getTypeOfGPUs() {
        return typeOfGPUs;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    public void setNumberOfInstance(String numberOfInstance) {
        this.numberOfInstance = numberOfInstance;
    }

    public void setOperatingSystemOrSoftware(String operatingSystemOrSoftware) {
        this.operatingSystemOrSoftware = operatingSystemOrSoftware;
    }

    public void setMachineClass(String machineClass) {
        this.machineClass = machineClass;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public void setAddGPUs(Boolean addGPUs) {
        isAddGPUs = addGPUs;
    }

    public void setNumberOfGPUs(String numberOfGPUs) {
        this.numberOfGPUs = numberOfGPUs;
    }

    public void setTypeOfGPUs(String typeOfGPUs) {
        this.typeOfGPUs = typeOfGPUs;
    }

    public void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public void setDatacenterLocation(String datacenterLocation) {
        this.datacenterLocation = datacenterLocation;
    }

    public void setCommittedUsage(String committedUsage) {
        this.committedUsage = committedUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputeEngine that = (ComputeEngine) o;
        return Objects.equals(numberOfInstance, that.numberOfInstance) &&
                Objects.equals(operatingSystemOrSoftware, that.operatingSystemOrSoftware) &&
                Objects.equals(machineClass, that.machineClass) &&
                Objects.equals(series, that.series) &&
                Objects.equals(machineType, that.machineType) &&
                Objects.equals(isAddGPUs, that.isAddGPUs) &&
                Objects.equals(numberOfGPUs, that.numberOfGPUs) &&
                Objects.equals(typeOfGPUs, that.typeOfGPUs) &&
                Objects.equals(localSSD, that.localSSD) &&
                Objects.equals(datacenterLocation, that.datacenterLocation) &&
                Objects.equals(committedUsage, that.committedUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfInstance, operatingSystemOrSoftware, machineClass, series,
                machineType, isAddGPUs, numberOfGPUs, typeOfGPUs, localSSD, datacenterLocation, committedUsage);
    }

    @Override
    public String toString() {
        return "ComputeEngine{" +
                "numberOfInstance='" + numberOfInstance + '\'' +
                ", operatingSystemOrSoftware='" + operatingSystemOrSoftware + '\'' +
                ", regularMachineClass='" + machineClass + '\'' +
                ", series='" + series + '\'' +
                ", machineType='" + machineType + '\'' +
                ", isAddGPUs=" + isAddGPUs +
                ", numberOfGPUs='" + numberOfGPUs + '\'' +
                ", typeOfGPUs='" + typeOfGPUs + '\'' +
                ", localSSD='" + localSSD + '\'' +
                ", datacenterLocation='" + datacenterLocation + '\'' +
                ", committedUsage='" + committedUsage + '\'' +
                '}';
    }
}
