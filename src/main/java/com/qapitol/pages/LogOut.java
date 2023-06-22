package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class LogOut extends Base {

    public void logOutPage() throws InterruptedException, AWTException {

        Thread.sleep(2000);
        WebElement profile = driver.findElement(By.xpath("//a[@id='username']"));
        profile.click();

        WebElement logout = driver.findElement(By.partialLinkText("Logout"));
        logout.click();
    }
}
