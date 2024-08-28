package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SauceProductsScreen extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/mTvTitle")
    private WebElement tituloApp;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productRV")
    private WebElement listaProductos;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private List<WebElement> imagenProductos;

    public void validarSauceLabs() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        WebElement encabezado = wait.until(ExpectedConditions.visibilityOf(tituloApp));
        Assert.assertTrue("La aplicación no se ha iniciado correctamente", encabezado.isDisplayed());
    }

    public void validarProductos() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(listaProductos));
        /*
        // Aquí se debería usar un localizador para el tipo de elemento
        By imagenProductosLocator = By.id("com.saucelabs.mydemoapp.android:id/productIV");
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(imagenProductosLocator, 0));

        // Verificar que se hayan cargado productos
        Assert.assertFalse("No se encontraron productos en la lista", imagenProductos.isEmpty());

        // Imprimir el número de productos encontrados
        System.out.println("Se encontraron " + imagenProductos.size() + " productos");

        // Verificar que las imágenes de los productos sean visibles
        for (WebElement productImage : imagenProductos) {
            Assert.assertTrue("Imagen de producto no visible", productImage.isDisplayed());
        }*/
    }


}
