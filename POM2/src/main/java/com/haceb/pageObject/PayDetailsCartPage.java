package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PayDetailsCartPage extends PageObject {
    private final By lblProductName= By.xpath(
            "//a[contains(@class,'c-on-base t-title lh-copy fw6 no-underline')]");

    public By getLblProductName() {
        return lblProductName;
    }

}
