package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class AddingToCart extends Base {


public void cart() throws AWTException, InterruptedException {
         Thread.sleep(2000);
       WebElement book= driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[3]/div[1]/a[1]/img[1]"));
        if(book.isDisplayed()){
            book.click();
            System.out.println("book is displayed");
        }else{
            System.out.println("book is not displayed");
        }
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
    Thread.sleep(5000);


}}
