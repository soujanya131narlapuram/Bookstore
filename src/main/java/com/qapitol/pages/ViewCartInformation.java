package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ViewCartInformation extends Base {

public void cartPage() throws InterruptedException {
     driver.findElement(By.id("username")).click();
    WebElement cartItems=driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[1]/a[1]"));
    cartItems.click();
    Thread.sleep(500);
    driver.findElement(By.xpath("//button[contains(text(),'Proceed To Checkout')]")).click();
    Thread.sleep(5000);
}
    public void pageValidate() {
        WebElement bookName = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/h1"));
        Assert.assertEquals(bookName.getText(), "Shopping Cart");
    }
}
