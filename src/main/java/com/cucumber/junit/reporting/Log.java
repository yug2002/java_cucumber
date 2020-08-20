package com.cucumber.junit.reporting;

import org.apache.log4j.Logger;

public class Log {

    private static final Logger LOG = Logger.getLogger("com.cucumber.junit");

    public static void info(Object message){
        LOG.info(message);
    }
    public static void error(Object message){
        LOG.error(message);
    }
    public static void debug(Object message){
        LOG.debug(message);
    }
}

