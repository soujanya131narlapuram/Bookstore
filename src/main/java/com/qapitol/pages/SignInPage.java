package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SignInPage extends Base {
    public void signIn() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
        Thread.sleep(1000);
        WebElement UserNameREmail = driver.findElement(By.id("userNameOrEmail"));
        UserNameREmail.sendKeys("soujanyan");
        Thread.sleep(1000);
        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passWord.sendKeys("Soujany@131");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
        Thread.sleep(2000);

    }

    public void pageValidate() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "React App");
    }
}
