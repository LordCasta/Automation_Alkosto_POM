package com.alkosto.steps;

import com.alkosto.pageObject.BusquedaPageObject;
import com.alkosto.pageObject.CarritoPageObject;
import com.alkosto.utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static com.alkosto.driver.SeleniumWebDriver.driver;

public class ValidacionesSteps {


    @Step
    public void validarProducto(){
        ArrayList<Map<String, String>> datosExcel;
        try{
            datosExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Compra");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement productoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(BusquedaPageObject.getTxtProducto(datosExcel.get(0).get("Producto"))));

            String textoElement = productoElement.getText();
            String textoLimpio = textoElement.replaceAll("\\n\\d+\\.\\d+\\n\\(\\d+\\)", "").trim();

            System.out.println(textoLimpio);
            System.out.println(datosExcel.get(0).get("Producto"));

            Assert.assertEquals(datosExcel.get(0).get("Producto").trim().toLowerCase(), textoLimpio.toLowerCase());

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Step
    public void validarCarrito(){
        ArrayList<Map<String, String>> datosExcel;
        try{
            datosExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Compra");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement precioElement = wait.until(ExpectedConditions.visibilityOfElementLocated(CarritoPageObject.getTxtPrecio()));
            String textoPrecio = precioElement.getText();

            Assert.assertEquals(datosExcel.get(0).get("Precio"), textoPrecio);


        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
