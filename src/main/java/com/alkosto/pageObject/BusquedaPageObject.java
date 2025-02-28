package com.alkosto.pageObject;

import com.alkosto.utils.DatosExcel;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Map;

public class BusquedaPageObject {


    private static By txtProducto;

    public static By getTxtProducto(String nombreProducto){
        txtProducto= By.xpath("//div[@id='js-hits']//a[.//h3[contains(text(), \"" + nombreProducto + "\")]]");
        return txtProducto;
    }

    BusquedaPageObject(){}
}
