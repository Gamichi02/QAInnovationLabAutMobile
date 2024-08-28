package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SuaceLabsLoginSteps;
import com.nttdata.steps.SuaceLabsCarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SauceLabsStepDef {
    @Steps
    //SuaceLabsLoginSteps login;
    SuaceLabsCarritoSteps carrito;

    /*
    @When("ingreso el usuario {string}")
    public void ingresoElUsuario(String usuario) {
        login.ingresoElUsuario(usuario);
    }

    @Given("ingreso al aplicativo de SauceLabs")
    public void ingresoAlAplicativoDeSauceLabs() {
    }

    @When("inicio sesión con mi usuario {string} y clave {string}")
    public void inicioSesiónConMiUsuarioYClave(String arg0, String arg1) {
        login.ingresoElUsuario(arg0);
        login.ingresarClave(arg1);
        login.ingresar();

    }



    @And("ingreso la clave {string}")
    public void ingresoLaClave(String arg0) {
        login.ingresarClave(arg0);
    }

    @And("hago clic en LOGIN")
    public void hagoClicEn() {
        login.ingresar();
    }

    @And("valido el login OK")
    public void validoElLoginOK() {
        login.validacionLogin();
    } */

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        carrito.validarAplicacionSauceLabs();
    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        carrito.validarProductos();
    }

    @When("agrego {string} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(String unidades, String nombreProducto) {
        carrito.clickEnProducto(nombreProducto);
        carrito.agregarUnidadesDeProducto(unidades);
        carrito.clickEnAddToCart();
    }

    @Then("valido que el carrito de compra se actualice correctamente")
    public void validoQueElCarritoDeCompraSeActualiceCorrectamente() {
        carrito.validarbadgeCarrito();
        carrito.abrirCarrito();
        carrito.validarProductoEnCarrito();
    }
}
