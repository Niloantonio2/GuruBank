package com.demoguru99.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Esperas {

    public void esperaImplicita(int seconds){
        getDriver().manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
    }
    public void esperaExplicitaClick(By Elemento)  {

        WebDriverWait wait = new WebDriverWait(getDriver(),10);
        // Usamos la espera explícita bajo una condiciones esperada, en este caso esperamos hasta que el elemento sea clicable
        wait.until(ExpectedConditions.elementToBeClickable(Elemento));
        /**alertIsPresent()
         elementSelectionStateToBe()
         elementToBeClickable()
         elementToBeSelected()
         frameToBeAvaliableAndSwitchToIt()
         invisibilityOfTheElementLocated()
         invisibilityOfElementWithText()
         presenceOfAllElementsLocatedBy()
         presenceOfElementLocated()
         textToBePresentInElement()
         textToBePresentInElementLocated()
         textToBePresentInElementValue()
         titleIs()
         titleContains()
         visibilityOf()
         visibilityOfAllElements()
         visibilityOfAllElementsLocatedBy()
         visibilityOfElementLocated()
         **/
    }

    public void esperaFluida(){
            Wait wait = new FluentWait(getDriver())
            .withTimeout(20, TimeUnit.SECONDS)
            .pollingEvery(4, TimeUnit.SECONDS)
            .ignoring(NoSuchElementException.class);
    }


}
