package com.alkosto.stepDefinitions;


import com.alkosto.driver.SeleniumWebDriver;
import com.alkosto.steps.AgregarCarritoSteps;
import com.alkosto.steps.FacturacionSteps;
import com.alkosto.steps.SeleccionProductoSteps;
import com.alkosto.steps.ValidacionesSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;


public class AgregarProductoStepDefinitions {

    @Steps
    SeleccionProductoSteps buscarProducto = new SeleccionProductoSteps();

    @Steps
    AgregarCarritoSteps agregarCarrito = new AgregarCarritoSteps();

    @Steps
    FacturacionSteps facturacion = new FacturacionSteps();

    @Steps
    ValidacionesSteps validar = new ValidacionesSteps();

    @Dado("Me encuentro en la pagina de Alkosto")
    public void meEncuentroEnLaPaginaDeAlkosto() {
        SeleniumWebDriver.chromeDrive("https://www.alkosto.com/");

    }
    @Cuando("Aparece la ventana y la opcion de buscar")
    public void apareceLaVentanaYLaOpcionDeBuscar() {
        buscarProducto.ventanaBusqueda();
    }
    @Cuando("Busco un producto para agregar al carrito")
    public void buscoUnProductoParaAgregarAlCarrito() {
        buscarProducto.buscar();
        validar.validarProducto();
        buscarProducto.seleccionarProducto();
        agregarCarrito.agregarCarrito();
        validar.validarCarrito();
        agregarCarrito.procederPago();
    }
    @Entonces("Visualizaré la ventana de facturación")
    public void visualizaréLaVentanaDeFacturación() {

        facturacion.llenarFormulario();

    }





}
