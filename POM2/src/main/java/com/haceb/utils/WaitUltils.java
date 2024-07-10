package com.haceb.utils;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class WaitUltils {
    public static void WaitElementAlone(WebDriver Driver, WebElement element){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Wait<WebDriver> wait =
                new FluentWait<>(Driver)
                        .withTimeout(Duration.ofSeconds(60))
                        .pollingEvery(Duration.ofMillis(1500))
                        .ignoring(ElementNotInteractableException.class);

        wait.until(
                d -> {
                    element.click();
                    return true;
                });
    }
}
