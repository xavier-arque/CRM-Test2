package com.itnove.crm.DashboardTest;

import com.itnove.crm.BaseTest;
import org.junit.Test;

public class DashboardTest extends BaseTest {

    @Test
    public void testApp() throws InterruptedException {
        //Accedir a pagina
        driver.navigate().to("http://crm.votarem.lu");
     }
}
