package org.example.Test.OrangeHRM;

import org.example.Base.BaseTest;
import org.example.Page.OrangeHRM.OrangeHRMLoginPage;
import org.testng.annotations.Test;

public final class OrangeHRMTests extends BaseTest {

    private OrangeHRMTests()
    {

    }

    @Test
    public void loginlogoutTest() throws InterruptedException {
        OrangeHRMLoginPage orangeHRMLoginPage = new OrangeHRMLoginPage();
        orangeHRMLoginPage.enterusername("Admin").enterpassword("admin123").clickLogin();

    }

}
