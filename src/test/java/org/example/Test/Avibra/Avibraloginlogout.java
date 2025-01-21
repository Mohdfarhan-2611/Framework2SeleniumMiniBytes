package org.example.Test.Avibra;


import org.assertj.core.api.Assertions;
import org.example.Base.BaseTest;
import org.example.Enum.ConfigProperties;
import org.example.Page.Avibra.AvibraHomePage;
import org.example.Page.Avibra.AvibraLoginPage;
import org.example.utils.PropertiesReader;
import org.testng.annotations.Test;

public final class Avibraloginlogout extends BaseTest {

    private Avibraloginlogout()
    {

    }


    @Test
    public static void loginlouttest() throws InterruptedException {
        String title = null;  //Login page
        try {
            title = new AvibraLoginPage()
                    .enterusername(PropertiesReader.get(ConfigProperties.USERNAME)).enterpassword(PropertiesReader.get(ConfigProperties.PASSWORD)).clicklogin() //Login page
                    .clickprofilebutton().clicklogout()  //Home page
                    .getTitle();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Assertions.assertThat(title).isNotNull().isNotEmpty().isNotBlank()
                .isEqualTo("Avibra - Live Well & Earn Insurance");

    }


}
