package com.haceb.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
//@DefaultUrl("https://www.haceb.com")
public class HomeHacebPage extends PageObject {

    private final By btnPop = By.xpath("//a[@aria-label=\"close window\"]");
    private final By inputSearch = By.xpath(
            "//input[@id=\"downshift-0-input\"]");
    private final By btnSearch = By.xpath(
            "//button[@aria-label=\"Buscar Productos\"]");
    private final By btnMenu = By.xpath(
            "(//div[contains(@class,'pa4 pointer hacebco-menu-drawer-0-x-openIconContainer hacebco-menu-drawer-0-x-openIconContainer--drawer-desktop')])[2]");
    private final By listCategoriaCollection = By.xpath(
            "//div[@class=\"hacebco-menu-drawer-0-x-menuItemText\"]");
    private final By listSubMenuCollection = By.xpath(
            "//ul/div/div[contains(@class, 'category')]");

    private final By txtSearch= By.xpath("//input[@id='downshift-0-input']");

    private final By btnClosedMenu= By.xpath(
            "//button[@class=\"hacebco-menu-drawer-0-x-closeIconButton hacebco-menu-drawer-0-x-closeIconButton--drawer-desktop pa4 pointer bg-transparent transparent bn pointer\"]");


    public By getTxtSearch() {
        return txtSearch;
    }

    public By getBtnPop() {
        return btnPop;
    }

    public By getInputSearch() {
        return inputSearch;
    }

    public By getBtnSearch() {
        return btnSearch;
    }

    public By getBtnMenu() {
        return btnMenu;
    }

    public By listCategoriaCollection() {
        return listCategoriaCollection;
    }

    public By listSubMenuCollection() {
        return listSubMenuCollection;
    }

    public By getBtnClosedMenu() {
        return btnClosedMenu;
    }
}
