package com.alkosto.steps;

import com.alkosto.pageObject.CarritoPageObject;
import com.alkosto.pageObject.ProductoPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.alkosto.driver.SeleniumWebDriver.driver;

public class AgregarCarritoSteps {

    @Step
    public void agregarCarrito(){
        esperarElementoVisible(ProductoPageObject.getBtnAgregarCarrito(), Duration.ofSeconds(10));
        clickJavaScript(ProductoPageObject.getBtnAgregarCarrito());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        esperarElementoVisible(ProductoPageObject.getBtnVerCarrito(), Duration.ofSeconds(15));
        clickJavaScript(ProductoPageObject.getBtnVerCarrito());
    }

    @Step
    public void procederPago(){
        esperarElementoVisible(CarritoPageObject.getBtnPago(), Duration.ofSeconds(10));
        seleccionClick(CarritoPageObject.getBtnPago());
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
