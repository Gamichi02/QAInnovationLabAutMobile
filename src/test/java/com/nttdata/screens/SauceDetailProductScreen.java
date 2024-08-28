package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SauceDetailProductScreen extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private WebElement btnMas;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement btnAddToCart;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartTV")
    private WebElement badgeCarrito;

    public void clickEnProducto(String nombreProducto) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10); // Espera de hasta 10 segundos
        WebElement productElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc='" + nombreProducto + "']")));
        productElement.click();
    }

    public void agregarUnidadesDeProducto(String unidades) {
        for (int i = 1; i < Integer.parseInt(unidades); i++) {  // Empezamos en 1 porque por defecto ya hay 1 unidad
            btnMas.click();
        }
    }

    public void addProductToCart() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10); // Espera de hasta 10 segundos
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.saucelabs.mydemoapp.android:id/cartBt")));
        addToCartButton.click();
    }

    public void validarbadgeCarrito() {
        int cantidadEnCarrito = Integer.parseInt(badgeCarrito.getText());
        Assert.assertTrue("El carrito no se actualizó correctamente", cantidadEnCarrito > 0);
    }

    public void clickEnCarrito() {
        badgeCarrito.click();
    }
}
