package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.awt.*;

public class PaymentPage extends Base {
public void paymentProcess() throws InterruptedException, AWTException {


    Robot robot=new Robot();
    robot.mouseWheel(3);
    driver.findElement(By.xpath("//button[contains(text(),'Proceed to Payment')]")).click();
    Thread.sleep(500);
    WebElement addCard=driver.findElement(By.xpath("//button[contains(text(),'Add Card')]"));
    addCard.click();
    WebElement cardRadioBtn = driver.findElement(By.id("pm_1NLgVBG9R9y827ntkfC3G2l9"));
    cardRadioBtn.click();
    Thread.sleep(500);
    WebElement proceedButton = driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[4]/button"));
    proceedButton.click();

}

    public void pageValidate() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, "http://139.59.27.246:3000/payment");
    }
}
