package com.alkosto.pageObject;

import org.openqa.selenium.By;

public class ProductoPageObject {



    private static By btnAgregarCarrito = By.xpath("//button[@id='addToCartButton']");

    private static By btnVerCarrito = By.xpath("//div[@class='modal-footer']/a[@href='/cart']");





    public static By getBtnAgregarCarrito(){
        return btnAgregarCarrito;
    }

    public static By getBtnVerCarrito(){
        return btnVerCarrito;
    }



    ProductoPageObject(){}

}
