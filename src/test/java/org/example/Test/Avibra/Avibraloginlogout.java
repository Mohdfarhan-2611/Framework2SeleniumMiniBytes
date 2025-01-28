package org.example.Test.Avibra;


import org.assertj.core.api.Assertions;
import org.checkerframework.checker.units.qual.C;
import org.example.Base.BaseTest;
import org.example.Enum.ConfigProperties;
import org.example.Page.Avibra.AvibraHomePage;
import org.example.Page.Avibra.AvibraLoginPage;
import org.example.Report.ExtentReport;
import org.example.utils.PropertiesReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public final class Avibraloginlogout extends BaseTest {

    private Avibraloginlogout()
    {

    }


    @Test(dataProvider = "AVIBRALOGINLOGOUT")
    public static void loginlouttest(String username, String password) throws InterruptedException {

        ExtentReport.createTest("AVIBRALOGINLOGOUT");

        String title = null;  //Login page
        try {
            title = new AvibraLoginPage()
                    .enterusername(username).enterpassword(password).clicklogin() //Login page
                    .clickprofilebutton().clicklogout()  //Home page
                    .getTitle();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Assertions.assertThat(title).isNotNull().isNotEmpty().isNotBlank()
                .isEqualTo("Avibra - Live Well & Earn Insurance");

    }



    @DataProvider(name = "AVIBRALOGINLOGOUT", parallel = true)
    public Object[][] getData() throws Exception {
        return new Object[][]
                {
                        {PropertiesReader.get(ConfigProperties.VALIDUSERNAME),PropertiesReader.get(ConfigProperties.VALIDPASSWORD)},
                        //{PropertiesReader.get(ConfigProperties.INVALIDUSERNAME),PropertiesReader.get(ConfigProperties.INVALIDPASSWORD)}
                };

    }


}
