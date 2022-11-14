package com.demoguru99.automation.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CuentaNuevaPageObjects extends PageObject {

    /**Esta clase se realiza con el fin de encontrar los elementos html del sitio web e interartuar con ellos**/

    //Localizadores de elementos html
    public By Btn_NuevaCuenta = By.linkText("New Account");
    public By Txt_ClienteID = By.name("cusid");
    public By Lst_CuentaCorriente = By.xpath("//option[@value='Current']");
    public By Lst_CuentaAhorros = By.xpath("//option[@value='Savings']");
    public By Txt_DepositoInicial = By.name("inideposit");
    public By Btn_envia2 = By.name("button2");
    public By Lbl_Cuentaregistrada = By.xpath("(//table[@id='account']//tr//td)[6]");

    //los metodos Setters realiazaran acciones en los elementos html localizados anteriormente
    public void setBtn_NuevaCuenta() {
        getDriver().findElement(Btn_NuevaCuenta).click();
    }

    public void setTxt_ClienteID(String ID) {
        getDriver().findElement(Txt_ClienteID).sendKeys(ID);
    }

    public void setLst_CuentaCorriente() {

        getDriver().findElement(Lst_CuentaCorriente).click();
    }

    public void setLst_CuentaAhorros() {
        getDriver().findElement(Lst_CuentaAhorros).click();
    }

    public void setTxt_DepositoInicial(String depositoInicial) {
        getDriver().findElement(Txt_DepositoInicial).sendKeys(depositoInicial);
    }

    public void setBtn_envia2() {
        getDriver().findElement(Btn_envia2).click();
    }
    public void setLbl_Cuentaregistrada() {
        getDriver().findElement(Lbl_Cuentaregistrada).isDisplayed();
    }
}
