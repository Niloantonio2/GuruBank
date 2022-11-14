package com.demoguru99.test.stepsdefinitions;

import com.demoguru99.automation.steps.ClienteYCuentaNuevaSteps;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;


public class ClienteYCuentaNuevaStepsDefinitions {

    /**Esta clase es donde se realiza la definicion de los pasos y para ello se llaman los metodos
     * creados en el step con el fin de que el runners los ejecute y a su vez como se trabajo con
     * cucumber y lenguaje gherking es una clase muy sencilla de entender ya que esta escrita en
     * leguaje cotindiano**/

    @Steps
    ClienteYCuentaNuevaSteps clienteYCuentaNuevaSteps;


    @Dado("^que me encuentro en el sitio web$")
    public void queMeEncuentroEnElSitioWeb() {
        clienteYCuentaNuevaSteps.AbrirSitioWebGuru();
    }

    @Cuando("^ingrese mis credenciales$")
    public void ingreseMisCredenciales() {
        clienteYCuentaNuevaSteps.inicioDeSesion();
    }

    @Entonces("^vizualizare bienvenido a gerente de Guru Bank$")
    public void vizualizareBienvenidoAGerenteDeGuruBank() {
        clienteYCuentaNuevaSteps.MensajeBienvenido();

    }

    @Cuando("^Diligencio el formulario de cliente nuevo$")
    public void diligencioElFormularioDeClienteNuevo() {
        clienteYCuentaNuevaSteps.IngresarDatosCliente();
    }

    @Entonces("^vizualizare cliente registrado exitosamente$")
    public void vizualizareClienteRegistradoExitosamente() {
        clienteYCuentaNuevaSteps.validacionMensajeCliente();

    }

    @Cuando("^Igrese el ID customer y creo nueva cuenta$")
    public void igreseElIDCustomerYCreoNuevaCuenta() {
        clienteYCuentaNuevaSteps.datosCuentaNueva();

    }

    @Entonces("^vizualizare cuenta creada exitosamente$")
    public void vizualizareCuentaCreadaExitosamente() {
        clienteYCuentaNuevaSteps.mensajeCuentaCreadaExitosamente();

    }






/*

    }

    @When("^Ingresar datos de cuenta$")
    public void ingresarDatosDeCuenta() {
        registerNewUserSteps.IngresarDatosCuenta();

    }

    @Then("^validar datos cuenta$")
    public void validarDatosCuenta() {
      registerNewUserSteps.ValidacionMensajeCuenta();
        System.out.println("validacionCuentaRegistrada");
    }*/
}
