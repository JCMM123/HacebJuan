package com.haceb.step;

import com.haceb.pageObject.ProductDetailsPage;
import com.haceb.models.NameProductModel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static com.haceb.models.NameProductModel.setNameProduct;

public class ProductDeatilsSteps {
    @Page
    ProductDetailsPage productDetailsPage;

    @Step("button add product to cart")
    public void addProductCart(){
        WebElement elemento = productDetailsPage.getDriver()
                .findElement(productDetailsPage.getTitleProduct());
        setNameProduct(elemento.getText());

        productDetailsPage.getDriver().findElement(productDetailsPage.getBtnAddToCart()).click();
    }

    @Step("clic on button cart")
    public void clicCart(){
        productDetailsPage.getDriver().findElement(productDetailsPage.getBtnCart()).click();
    }
}
