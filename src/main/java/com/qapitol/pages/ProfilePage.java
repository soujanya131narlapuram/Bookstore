package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;

public class ProfilePage extends Base {

    public void profileUpdate() throws InterruptedException {
      Thread.sleep(1500);
      driver.findElement(By.xpath("//a[@id='username']")).click();
      Thread.sleep(500);
      driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("Souj@ny@111");
        driver.findElement(By.id("confirmPassword")).sendKeys("Souj@ny@111");
        Thread.sleep(5000);
        WebElement updateBtn=driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[1]/form/button"));
        updateBtn.click();
        Thread.sleep(5000);
      String url = driver.getCurrentUrl();
      Assert.assertEquals(url, "http://139.59.27.246:3000/order/00e00429-b98b-4024-bb26-d51d72feea34");

    }
}
