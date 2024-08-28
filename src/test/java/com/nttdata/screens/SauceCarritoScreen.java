package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SauceCarritoScreen extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private WebElement imagenProducto;

    public void validarProductoEnCarrito() {
        // Agregar una espera explícita de hasta 10 segundos para que la imagen sea visible
        /*WebDriverWait wait = new WebDriverWait(getDriver(), 10); // Espera de hasta 10 segundos
        WebElement productoVisible = wait.until(ExpectedConditions.visibilityOf(imagenProducto)); // Espera hasta que el elemento sea visible

        // Una vez que el elemento es visible, realizamos la validación
        Assert.assertNotNull("El producto no está en el carrito", productoVisible);*/

        // Aumentar el tiempo de espera a 10 segundos y un intervalo de sondeo de 500ms
        WebDriverWait wait = new WebDriverWait(getDriver(), 10, 500); // Espera de hasta 10 segundos con un sondeo de 500ms
        try {
            // Esperamos que el elemento sea visible en ese tiempo
            WebElement productoVisible = wait.until(ExpectedConditions.visibilityOf(imagenProducto));
            Assert.assertNotNull("El producto no está visible en el carrito", productoVisible);
        } catch (Exception e){
            Assert.fail("El producto no apareció en el carrito dentro del tiempo esperado");
            System.out.println(e.getMessage());
        }
    }
}
