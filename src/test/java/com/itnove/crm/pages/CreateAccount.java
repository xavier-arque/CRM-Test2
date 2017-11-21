package com.itnove.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateAccount {

    private WebDriver driver;
/*

WOKRING ON IT, SO FAR IS A LOGINPAGE COPY
    By usernameLocator = By.id("user_name");
    By websiteLocator = By.id("user_password");
    By loginFormLocator = By.id("bigbutton");

        @FindBy(xpath = ".//span[@class='error'][3]")
    public WebElement errorMessage;



    public CreateAccount(WebDriver driver)
    {
        this.driver = driver;
        // ho farem desde l'objecte login correcte o incorrecte
       // driver.get("http://crm.votarem.lu/");
       // driver.manage().window().maximize();
    }

    public void with (String username, String password)
    {
        // neteja els camps i insereix text
        driver.findElement(usernameLocator).clear();
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(usernameLocator).clear();
        driver.findElement(passwordLocator).sendKeys(password);

        driver.findElement(loginFormLocator).submit();
    }

    // tractament dels missatges d'error

    public boolean isErrorMessagePresent(WebDriver driver, WebDriverWait wait){
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.isDisplayed();
    }

    public String errorMessageDisplayed()
    {
        return errorMessage.getText();
    }

    // mogut a la plana dashboard
    // By successMessageLocator = By.id("tab0");

  moure a la plana dashboard
    public Boolean successMessagePresent()
    {
        return driver.findElement(successMessageLocator).isDisplayed();
    }

*/
}
