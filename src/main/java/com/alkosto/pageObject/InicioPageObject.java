package com.alkosto.pageObject;

import org.openqa.selenium.By;

public class InicioPageObject {

    private static By btnBusqueda = By.xpath("//input[@id='js-algolia-site-search-input']");

    private static By txtBuscar = By.xpath("//input[@id='autocomplete-0-input']");

    private static By btnLupaBuscar = By.xpath("//i[@class='icon alk-icon-search-mobile js-site-search-icon-modal algoliaAutocompletev2__searchIcon']");

    public static By getBtnBusqueda(){
        return btnBusqueda;
    }

    public static By getTxtBuscar(){
        return txtBuscar;
    }

    public static By getBtnLupaBuscar(){
        return btnLupaBuscar;
    }

    InicioPageObject(){}
}
