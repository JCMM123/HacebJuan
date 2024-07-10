package com.haceb.step;

import com.haceb.pageObject.ProductListPage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;
import com.haceb.models.NameProductModel;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static com.haceb.models.NameProductModel.setNameProduct;
import static com.haceb.utils.RandomSelection.selectRandom;
import static com.haceb.utils.ScrollUtil.ScrollToProduct;

public class ProductListSteps {
    @Page
    ProductListPage productListPage;

    @Step("Selecciona el producto para el carrito de compras")
    public void UserPressesTheButtonAddToCart(){

        // elementMolesto

        WebElement elementMolesto = productListPage.getDriver()
                .findElement(productListPage.getMolesto());

        if (elementMolesto.isDisplayed()) {
            try{
            WaitUntil.the(productListPage.getBtnProductoCollection(),
                    WebElementStateMatchers.isEnabled()).forNoMoreThan(10).seconds();
            }catch (Exception e){
                System.out.println("error element "+e);
            }
        }

        //getBtnProductoCollection
        try{
            WaitUntil.the(productListPage.getBtnProductoCollection(),
                    WebElementStateMatchers.isEnabled());
        }catch (Exception e){
            System.out.println("error element "+e);
        }

        List<WebElement> collections = productListPage.getDriver()
                .findElements(productListPage.getBtnProductoCollection());
        WebElement element = selectRandom(collections);

        if (element.isEnabled()) {
            ScrollToProduct(productListPage.getDriver(),element);
            element.click();
        }else{
            setNameProduct("OKTODOESTABIEN");
        }
    }
}
