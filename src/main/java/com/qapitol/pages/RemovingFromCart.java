package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;

public class RemovingFromCart extends Base {
    public void deletionOfProduct() throws InterruptedException, AWTException {



        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/button[1]")).click();
        Thread.sleep(1500);


    }
     public void pageValidation()
     {
    String url = driver.getCurrentUrl();
    System.out.println("url:"+url);
    Assert.assertEquals(url, "http://139.59.27.246:3000/cart/16?qty=1");
}
}


