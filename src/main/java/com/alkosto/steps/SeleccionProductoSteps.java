package com.alkosto.steps;

import com.alkosto.pageObject.BusquedaPageObject;
import com.alkosto.pageObject.InicioPageObject;
import com.alkosto.utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static com.alkosto.driver.SeleniumWebDriver.driver;

public class SeleccionProductoSteps {

    @Step
    public void ventanaBusqueda(){
        seleccionClick(InicioPageObject.getBtnBusqueda());

    }

    @Step
    public void buscar(){

        ArrayList<Map<String, String>> datosExcel;
        try{

            datosExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Compra");
            escrituraTexto(InicioPageObject.getTxtBuscar(), datosExcel.get(0).get("Producto"));
            seleccionClick(InicioPageObject.getBtnLupaBuscar());

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Step
    public void seleccionarProducto(){
        ArrayList<Map<String, String>> datosExcel;
        try {
            datosExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Compra");
            esperarElementoVisible(BusquedaPageObject.getTxtProducto(datosExcel.get(0).get("Producto")), Duration.ofSeconds(10));
            clickJavaScript(BusquedaPageObject.getTxtProducto(datosExcel.get(0).get("Producto")));
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void seleccionClick(By elemento){
        driver.findElement(elemento).click();
    }

    public void esperarElementoVisible(By elemento, Duration tiempoEsperaSegundos){
        WebDriverWait wait = new WebDriverWait(driver, tiempoEsperaSegundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public void clickJavaScript(By elemento) {
        WebElement element = driver.findElement(elemento);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public void escrituraTexto(By elemento, String texto){
        driver.findElement(elemento).sendKeys(texto);
    }

}
