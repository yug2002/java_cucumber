package com.cucumber.junit.hooks;


import com.cucumber.junit.driver.DriverManager;
import com.cucumber.junit.reporting.Log;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class DriverHooks {

   public final String DATA = "";

   @Before
   public void setupDriver(){
       Log.info("Driver start");
       DriverManager.setupDriver();
   }

   @After
    public void quitDriver(){
       DriverManager.quitDriver();
       Log.info("Driver quit");
   }
}
