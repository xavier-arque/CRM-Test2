package com.itnove.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by guillem on 01/03/16.
 */

public class DashboardPage {

    private WebDriver driver;

    By successMessageLocator = By.id("tab0");

    //WebElement successMessageLocator = driver.findElement(By.id("tab0"));

    // @FindBy(id = "tab0")
    // public WebElement suiteCrmDashboard;




    public Boolean successMessagePresent(WebDriver driver, WebDriverWait wait)
    {
        //wait.until(ExpectedConditions.visibilityOf(successMessageLocator));
        return driver.findElement(successMessageLocator).isDisplayed();
    }

     /*public boolean isDashboardLoaded(WebDriver driver, WebDriverWait wait){
        wait.until(ExpectedConditions.visibilityOf(suiteCrmDashboard));
        return suiteCrmDashboard.isDisplayed();
    }*/


    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }
}
