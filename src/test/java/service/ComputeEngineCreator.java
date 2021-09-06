package service;

import model.ComputeEngine;

public class ComputeEngineCreator {

    public static final String TESTDATA_NUMBER_OF_INSTANCE = "testdata.computeengine.numberofinstance";
    public static final String TESTDATA_OPERATING_SYSTEM_OR_SOFTWARE = "testdata.computeengine.operatingsystemorsoftware";
    public static final String TESTDATA_MACHINE_CLASS = "testdata.computeengine.machineclass";
    public static final String TESTDATA_SERIES = "testdata.computeengine.series";
    public static final String TESTDATA_MACHINE_TYPE = "testdata.computeengine.machinetype";
    public static final String TESTDATA_ADD_GPUS = "testdata.computeengine.addgpus";
    public static final String TESTDATA_NUMBER_OF_GPUS = "testdata.computeengine.numberofgpus";
    public static final String TESTDATA_TYPE_OF_GPUS = "testdata.computeengine.typeofgpus";
    public static final String TESTDATA_LOCAL_SSD = "testdata.computeengine.localssd";
    public static final String TESTDATA_DATACENTER_LOCATION = "testdata.computeengine.datacenterlocation";
    public static final String TESTDATA_COMMITTED_USAGE = "testdata.computeengine.committedusage";

    public static ComputeEngine withCredentialsFromProperty() {
        return new ComputeEngine(TestDataReader.getTestData(TESTDATA_NUMBER_OF_INSTANCE),
                TestDataReader.getTestData(TESTDATA_OPERATING_SYSTEM_OR_SOFTWARE),
                TestDataReader.getTestData(TESTDATA_MACHINE_CLASS),
                TestDataReader.getTestData(TESTDATA_SERIES),
                TestDataReader.getTestData(TESTDATA_MACHINE_TYPE),
                Boolean.parseBoolean(TestDataReader.getTestData(TESTDATA_ADD_GPUS)),
                TestDataReader.getTestData(TESTDATA_NUMBER_OF_GPUS),
                TestDataReader.getTestData(TESTDATA_TYPE_OF_GPUS),
                TestDataReader.getTestData(TESTDATA_LOCAL_SSD),
                TestDataReader.getTestData(TESTDATA_DATACENTER_LOCATION),
                TestDataReader.getTestData(TESTDATA_COMMITTED_USAGE));

    }
}
