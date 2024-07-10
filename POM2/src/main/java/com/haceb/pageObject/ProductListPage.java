package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductListPage extends PageObject {

    ////span[@class="vtex-product-summary-2-x-productBrand vtex-product-summary-2-x-brandName t-body"]
    private final By btnProductoCollection = By.xpath(
            "//span[contains(text(),\"Ver producto\")]");

    private final By Molesto = By.xpath(
            "//div[@style=\"\"]");

    public By getBtnProductoCollection() {
        return btnProductoCollection;
    }

    public By getMolesto() {
        return Molesto;
    }
}

