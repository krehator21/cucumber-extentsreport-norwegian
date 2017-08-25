package com.cucumber.stepdefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.no.Gitt;
import cucumber.api.java.no.Når;
import cucumber.api.java.no.Så;

import java.io.IOException;

public class MyStepdefs {

    @Before
    public void beforeScenario(Scenario scenario) {
        if (scenario.getName().equals("My First Scenario")) {
            Reporter.assignAuthor("Vimalraj");
        }
    }

    @Gitt("I have (\\d+) cukes in my belly") public void I_have_cukes_in_my_belly(int cukes)
        throws IOException {
        Reporter.addStepLog("My test addStepLog message");
        Reporter.addScenarioLog("This is scenario log");
        //        Reporter.addScreenCaptureFromPath(
        //            "/Users/vimalrajselvam/Downloads/best-resume-template-2016-3.jpg", "My title");
    }

    @Gitt("I have (\\d+) cukes in my bellies") public void I_have_cukes_in_my_bellies(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
    }

    @Så("^I print$") public void iPrint() throws Throwable {
        //        Assert.assertTrue(false);
    }

    @Når("^I login with credentials$") public void iLoginWithCredentials(DataTable table) {
    }
}
