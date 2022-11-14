package com.demoguru99.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ClienteNuevoPageObjects extends PageObject {
    /**Esta clase se realiza con el fin de encontrar los elementos html del sitio web e interartuar con ellos**/

    //Localizadores de elementos html
    public By Btn_ClienteNuevo = By.linkText("New Customer");
    public By Txt_Nombre = By.name("name");
    public By Btn_Masculino =  By.xpath("//input[@value='m']");
    public By Btn_Femenina =  By.xpath("//input[@value='f']");
    public By TXt_FechaDeNacimiento = By.name("dob");
    public By Txt_Direccion = By.name("addr");
    public By Txt_Ciudad = By.name("city");
    public By Txt_Departamento = By.name("state");
    public By Txt_Pin = By.name("pinno");
    public By Txt_NumeroCelular = By.name("telephoneno");
    public By Txt_Email = By.name("emailid");
    public By Txt_Contrasena = By.name("password");
    public By Btn_Enviar = By.name("sub");
    public By LbL_ClienteRegistadoOK = By.xpath("(//table[@id='customer']//tr//td)[1]");
    public By Lbl_IDcliente = By.xpath("(//table[@id='customer']//tr//td)[5]");

    //los metodos Setters realiazaran acciones en los elementos html localizados anteriormente
    public void setBtn_ClienteNuevo() { getDriver().findElement(Btn_ClienteNuevo).click();//Click en elemento html localizado
    }
    public void setTxt_Nombre(String nombre) {
        getDriver().findElement(Txt_Nombre).sendKeys(nombre);//Escribir texto en elemento html localizado
    }
    public void setBtn_Masculino() {
        getDriver().findElement(Btn_Masculino).click();//Click en elemento html localizado
    }
    public void setBtn_Femenina() {
        getDriver().findElement(Btn_Femenina).click();//Click en elemento html localizado
    }
    public void setTXt_FechaDeNacimiento(String Fecha) {
        getDriver().findElement(TXt_FechaDeNacimiento).sendKeys(Fecha);//Escribir texto en elemento html localizado
    }
    public void setTxt_Direccion(String direccion) {
        getDriver().findElement(Txt_Direccion).sendKeys(direccion); //Escribir texto en elemento html localizado
    }
    public void setTxt_Ciudad(String Ciudad) {
        getDriver().findElement(Txt_Ciudad).sendKeys(Ciudad);//Escribir texto en elemento html localizado
    }
    public void setTxt_Departamento(String departamento) {
        getDriver().findElement(Txt_Departamento).sendKeys(departamento);//Escribir texto en elemento html localizado
    }
    public void setTxt_Pin(String pin) {
        getDriver().findElement(Txt_Pin).sendKeys(pin);//Escribir texto en elemento html localizado
    }
    public void setTxt_NumeroCelular(String numeroCelular) {

        getDriver().findElement(Txt_NumeroCelular).sendKeys(numeroCelular);//Escribir texto en elemento html localizado
    }
    public void setTxt_Email(String email) {

        getDriver().findElement(Txt_Email).sendKeys(email);//Escribir texto en elemento html localizado
    }
    public void setTxt_Contrasena(String contrasena) {
        getDriver().findElement(Txt_Contrasena).sendKeys(contrasena);//Escribir texto en elemento html localizado
      }
    public void setBtn_Enviar() {
        getDriver().findElement(Btn_Enviar).click();} //Click en elemento html localizado
    public void setLbL_ClienteRegistadoOK() {
        getDriver().findElement(LbL_ClienteRegistadoOK).isDisplayed(); //Nos dice si  elemento html localizado se encuentra visible
    }


    public static String ID;
    public void setLbl_IDcliente() {
        ID = getDriver().findElement(Lbl_IDcliente).getText(); //Guardamos en una variable elemento html localizado
    }
}
