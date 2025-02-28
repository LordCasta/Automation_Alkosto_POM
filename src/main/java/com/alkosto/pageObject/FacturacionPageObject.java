package com.alkosto.pageObject;

import org.openqa.selenium.By;

public class FacturacionPageObject {

    private static By txtCorreo = By.xpath("//input[@name='j_username']");

    private static By btnEnviarCorreo = By.xpath("//form[@id='alkostoSoftLoginForm']//button[@type='submit']");

    private static By txtNombre = By.xpath("//input[@id='firstName']");
    private static By txtApellido = By.xpath("//input[@id='lastName']");

    private static By btnAutorizo = By.xpath("//label[@class='form-check-label']");

    public static By getTxtCorreo(){
        return txtCorreo;
    }

    public static By getBtnEnviarCorreo(){
        return btnEnviarCorreo;
    }

    public static By getTxtNombre(){
        return txtNombre;
    }
    public static By getTxtApellido(){
        return txtApellido;
    }
    public static By getBtnAutorizo(){
        return btnAutorizo;
    }

}
