package com.cucumber.junit.hooks;

import com.cucumber.junit.reporting.Log;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class ErrorsHook {

    @After
    public void errorHandler(Scenario scenario){
        if(scenario.isFailed()){
            //TODO here we should handle errors
            Log.error(scenario.getStatus());
        }
    }
}
