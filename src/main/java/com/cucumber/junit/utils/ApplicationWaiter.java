package com.cucumber.junit.utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Predicate;

public class ApplicationWaiter {

    private static final long TIME_OUT = 20;
    private static final int POLLING = 2;
    private static final long INTERVAL = 50;
    private static final long TIME_OUT_MS = 15000;

    public static Wait<WebDriver> getFluentWait(WebDriver driver) {
        Wait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(TIME_OUT)).
                pollingEvery(Duration.ofSeconds(POLLING)).
                ignoring(NoSuchElementException.class).
                ignoring(StaleElementReferenceException.class).
                withMessage("ApplicationWait did not wait for element");
        return wait;
    }

    public static void WaitFor(Predicate<Boolean> condition, int timeOut) {

        long currentTimeJava8 = Instant.now().toEpochMilli();
        while ((Instant.now().toEpochMilli() - currentTimeJava8) < timeOut) {
            try {
                if (condition.test(true)) {
                    return;
                }
            } catch (Exception e) {
                //skip
            }
            try {
                Thread.sleep(INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }

    public static void WaitFor(Predicate<Boolean> condition) {

        long currentTimeJava8 = Instant.now().toEpochMilli();
        while ((Instant.now().toEpochMilli() - currentTimeJava8) < TIME_OUT_MS) {
            try {
                if (condition.test(true)) {
                    return;
                }
            } catch (Exception e) {
                //skip
            }
            try {
                Thread.sleep(INTERVAL);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }
    }
}
