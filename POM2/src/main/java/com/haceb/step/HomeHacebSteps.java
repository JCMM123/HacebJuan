package com.haceb.step;

import com.haceb.pageObject.HomeHacebPage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static com.haceb.utils.RandomSelection.selectRandom;
import static com.haceb.utils.ScrollUtil.ScrollToProduct;

public class HomeHacebSteps {
    @Page
    HomeHacebPage HomeHacebPage;
    @Step("Abrir el navegador")
    public void userOpenBrowser(){
        HomeHacebPage.openUrl("https://www.haceb.com");
    }

    @Step("cerrar alerta")
    public void clickAlert(){

        try{
            WaitUntil.the(HomeHacebPage.getBtnPop(), WebElementStateMatchers.isEnabled());
            HomeHacebPage.getDriver().findElement(HomeHacebPage.getBtnPop()).click();
        }catch (Exception e){
            System.out.println("error element "+e);
        }
    }

    @Step("Product Search")
    public void search(io.cucumber.datatable.DataTable dataTable){
        //Seccion para determinar si se busca con categoria o barra de busqueda
        if (dataTable.cell(1,0).equals("true")) {

            HomeHacebPage.getDriver().findElement(HomeHacebPage.getBtnMenu()).click();

            List<WebElement> categoriasColeccion = HomeHacebPage.getDriver()
                    .findElements(HomeHacebPage.listCategoriaCollection());
            //categoriasColeccion.get(2).click();
            WebElement element = selectRandom(categoriasColeccion);
            element.click();

            //Revisamos que existan las sub categorias
            if (!(HomeHacebPage.getDriver().findElements(HomeHacebPage.listSubMenuCollection()).isEmpty())) {

                List<WebElement> subCategoriasCollection = HomeHacebPage.getDriver()
                        .findElements(HomeHacebPage.listSubMenuCollection());
                 element = selectRandom(subCategoriasCollection);
                ScrollToProduct(HomeHacebPage.getDriver(),element);
                element.click();
                //HomeHacebPage.getDriver().findElement(HomeHacebPage.getBtnClosedMenu()).click();

            }

        } else {

            HomeHacebPage.getDriver().findElement(HomeHacebPage.getTxtSearch())
                    .sendKeys("neveras", Keys.ENTER);

        }
    }
}
