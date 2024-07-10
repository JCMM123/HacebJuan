package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductDetailsPage extends PageObject {
    private final By btnAddToCart = By.xpath("//span[contains(.,\"Agregar al carrito\")]");
    private final By titleProduct = By.xpath("//span[@class=\"vtex-store-components-3-x-productBrand \"]");


    private final By btnCart=By.xpath("(//span[contains(@class,'vtex-mini')])[1]");
    public By getBtnCart() {
        return btnCart;
    }

    public By getBtnAddToCart() {
        return btnAddToCart;
    }

    public By getTitleProduct() {
        return titleProduct;
    }
}
