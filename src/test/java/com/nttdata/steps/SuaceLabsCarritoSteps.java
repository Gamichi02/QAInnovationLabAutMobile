package com.nttdata.steps;

import com.nttdata.screens.SauceCarritoScreen;
import com.nttdata.screens.SauceDetailProductScreen;
import com.nttdata.screens.SauceProductsScreen;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuaceLabsCarritoSteps {
    SauceProductsScreen productsScreen;
    SauceDetailProductScreen detailProductScreen;
    SauceCarritoScreen carritoScreen;

    public void validarAplicacionSauceLabs() {
        productsScreen.validarSauceLabs();
    }

    public void validarProductos() {
        productsScreen.validarProductos();
    }

    public void clickEnProducto(String nombreProducto) {
        detailProductScreen.clickEnProducto(nombreProducto);
    }

    public void agregarUnidadesDeProducto(String unidades) {
        detailProductScreen.agregarUnidadesDeProducto(unidades);
    }

    public void clickEnAddToCart() {
        detailProductScreen.addProductToCart();
    }

    public void validarbadgeCarrito() {
        detailProductScreen.validarbadgeCarrito();
    }

    public void abrirCarrito() {
        detailProductScreen.clickEnCarrito();
    }

    public void validarProductoEnCarrito() {
        carritoScreen.validarProductoEnCarrito();
    }
}
