package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddressPage extends Base {
    public void addressAdding() throws InterruptedException {
        WebElement cartItems = driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[1]/a[1]"));
        cartItems.click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[contains(text(),'Proceed To Checkout')]")).click();
        Thread.sleep(500);
        driver.findElement(By.id("addressLine1")).sendKeys("telengana");
        Thread.sleep(500);
        driver.findElement(By.id("addressLine2")).sendKeys("hyderabad" + "," + "chowdariguda");
        Thread.sleep(500);
        driver.findElement(By.id("city")).sendKeys("hyderabad");
        Thread.sleep(500);
        driver.findElement(By.id("state")).sendKeys("telangana");
        Thread.sleep(500);
        Select countryDropDown = new Select(driver.findElement(By.id("country")));
        Thread.sleep(500);
        countryDropDown.selectByValue("AS");
        Thread.sleep(500);
        driver.findElement(By.id("postalCode")).sendKeys("500088");
        Thread.sleep(500);
        driver.findElement(By.id("phone")).sendKeys("9381220872");
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[contains(text(),'Add New Address')]")).click();
        Thread.sleep(500);

        WebElement addressRadioBtn= driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        addressRadioBtn.click();
        Thread.sleep(2000);





    }    public void pageValidate()
    {
            String url = driver.getCurrentUrl();
            Assert.assertEquals(url, "http://139.59.27.246:3000/shipping");
        }

}
