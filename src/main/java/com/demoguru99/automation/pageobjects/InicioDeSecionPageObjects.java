package com.demoguru99.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://demo.guru99.com/V4/index.php") //sitio web que se abre por defecto
public class InicioDeSecionPageObjects extends PageObject {

    /**Esta clase se realiza con el fin de encontrar los elementos html del sitio web e interartuar con ellos**/

    //Localizadores de elementos html
    public  By Txt_NombreUsuario = By.name("uid");
    public By Txt_Contrasena =  By.name("password");
    public By Btn_iniciar = By.name("btnLogin");
    public By Lbl_Bienvenido = By.xpath("//marquee[@class='heading3']");

    //los metodos Setters realiazaran acciones en los elementos html localizados anteriormente

    public void setTxtNombreUsuario(String NombreUsuario) {
       getDriver().findElement(Txt_NombreUsuario).sendKeys(NombreUsuario); //Escribir texto en elemento html localizado
    }
    public void setTxt_Contrasena(String Contrasena) {
        getDriver().findElement(Txt_Contrasena).sendKeys(Contrasena);//Escribir texto en elemento html localizado
    }
    public void setBtn_iniciar() {
        getDriver().findElement(Btn_iniciar).click();//Click en elemento html localizado
    }

    public void setLbl_Bienvenido() {
        getDriver().findElement(Lbl_Bienvenido).isDisplayed();//Nos dice si  elemento html localizado se encuentra visible

    }
}
