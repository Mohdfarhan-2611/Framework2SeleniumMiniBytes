package org.example.Test.eBay;

import static org.assertj.core.api.Assertions.*;
import org.example.Base.BaseTest;
import org.example.Driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public final class HomePageTest extends BaseTest {


    private HomePageTest()
    {

    }
    /*
       verify the title is containing ebay or eBay
       verify the title is not null and length of the title is greater than 10 and less than 100
       check for the links in the pages --->
       number of links displayed is exactly 10 or 15

     */


    @Test
    public static void test03() throws InterruptedException {
        DriverManagerTL.getDriver().findElement(By.xpath("//input[@title='Search']")).sendKeys("Mac mini", Keys.ENTER);
        String title =  DriverManagerTL.getDriver().getTitle();

        assertThat(title)
                .isNotNull()
                .containsIgnoringCase("ebay")
                .matches("\\w.*"+"eBay")
                .hasSizeBetween(10,100);

        List<WebElement> elements = DriverManagerTL.getDriver().findElements(By.xpath("//div[@class='s-item__title']"));
        assertThat(elements)
                .hasSizeGreaterThan(10)
                .extracting(WebElement::getText)
                .contains("Apple Mac Mini 2018 8GB 16GB 32GB 64GB All Storage Intel i3 i5 i7 - Excellent");











    }



}
