package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends Base {

    public void registerAsUser(String username,String FirstName,String Email,String password,String ConfirmPassword) throws InterruptedException {
        Thread.sleep(1000);
         driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div/div/div/a")).click();
        Thread.sleep(500);
        WebElement userName= driver.findElement(By.id("userName"));
        userName.sendKeys(username);
        Thread.sleep(500);
        WebElement firstName=driver.findElement(By.id("firstName"));
        firstName.sendKeys(FirstName);
        Thread.sleep(500);
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys(Email);
        Thread.sleep(500);
        WebElement passWord=driver.findElement(By.id("password"));
        passWord.sendKeys(password);
        Thread.sleep(500);
        WebElement confirmPassWord= driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"));
        confirmPassWord.sendKeys(ConfirmPassword);
        Thread.sleep(500);
        WebElement registerBtn= driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
        registerBtn.click();
        Thread.sleep(3000);
    }
}
