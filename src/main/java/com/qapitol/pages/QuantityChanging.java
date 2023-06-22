package com.qapitol.pages;

import com.qapitol.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class QuantityChanging extends Base
{

    public void quantityModification() throws InterruptedException
    {

        Thread.sleep(1000);
        Select quantityDropDown=new Select(driver.findElement(By.xpath("//body/div[@id='root']/main[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/select[1]")));
        quantityDropDown.selectByIndex(2);
    }
}
