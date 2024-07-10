package com.haceb.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollUtil {
    public static void ScrollToProduct(WebDriver Driver, WebElement element){
        new Actions(Driver)
                .scrollToElement(element)
                .perform();
    }
}
