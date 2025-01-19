package org.example.Test.Avibra;


import org.assertj.core.api.Assertions;
import org.example.Base.BaseTest;
import org.example.Page.Avibra.AvibraHomePage;
import org.example.Page.Avibra.AvibraLoginPage;
import org.testng.annotations.Test;

public final class Avibraloginlogout extends BaseTest {

    private Avibraloginlogout()
    {

    }


    @Test
    public static void loginlouttest() throws InterruptedException {
        String title = new AvibraLoginPage()
                .enterusername("kumarsanjay2001us@gmail.com").enterpassword("c0dpiI#8").clicklogin() //Login page
                .clickprofilebutton().clicklogout()  //Home page
                .getTitle();  //Login page


        Assertions.assertThat(title).isNotNull().isNotEmpty().isNotBlank()
                .isEqualTo("Avibra - Live Well & Earn Insurance");

    }


}
