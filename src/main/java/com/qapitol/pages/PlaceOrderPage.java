package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;

public class PlaceOrderPage extends Base
{
  public void orderPlacing() throws InterruptedException, AWTException {
      Thread.sleep(1000);


      WebElement orderButton = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div[2]/div/div/div[6]/button"));
      orderButton.click();
      Thread.sleep(6000);
  }

    public void pageValidate() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "http://139.59.27.246:3000/placeorder");
    }
}
