package com.itnove.crm.login;

import com.itnove.crm.BaseTest;
import com.itnove.crm.pages.DashboardPage;
import com.itnove.crm.pages.LoginPage;
import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;


public class LoginCorrecteTest extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {

        LoginPage login= new LoginPage(driver);

      // Accedir a la plana i maximitzar el navegador
        driver.navigate().to("http://crm.votarem.lu");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //crida a login de LoginPage per a fer el login

        login.with("user","bitnami");

        DashboardPage dashboardPage = new DashboardPage(driver);
        //Comprovo que arribo al dashboard
        assertTrue(dashboardPage.successMessagePresent(driver,wait));
       // assertTrue("missatge no present",login.successMessagePresent());

         // user = user
        // password  bitnami

    }
}
