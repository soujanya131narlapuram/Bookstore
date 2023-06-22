package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;

public class AddingMoreProducts extends Base {

    public void addingProductsToCart() throws AWTException, InterruptedException {
       WebElement moreBooks=driver.findElement(By.xpath("//a[contains(text(),'Add more books')]"));
       moreBooks.click();
        Thread.sleep(2000);
        Robot robot = new Robot();
        robot.mouseWheel(5000);
          driver.findElement(By.xpath("//a[contains(text(),'2')]")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[1]/div[2]/div/a/img")).click();

        Thread.sleep(500);
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
        Thread.sleep(4000);



    }


}
