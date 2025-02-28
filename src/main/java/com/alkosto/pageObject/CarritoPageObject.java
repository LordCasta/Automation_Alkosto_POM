package com.alkosto.pageObject;

import org.openqa.selenium.By;

public class CarritoPageObject {

    private static By btnPago = By.xpath("//button[@id='js-go-to-pay']");

    private static By txtPrecio = By.xpath("//div[@class='col-xs-6 no-padding cart-totals-right text-right grand-total mycart mycart__title mycart--bold js-cart-total']");

    public static By getBtnPago(){
        return btnPago;
    }

    public static By getTxtPrecio(){
        return txtPrecio;
    }

    CarritoPageObject(){}


}
