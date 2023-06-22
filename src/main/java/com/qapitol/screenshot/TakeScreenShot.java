package com.qapitol.screenshot;

import com.qapitol.base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static com.qapitol.base.Base.driver;

public class TakeScreenShot extends Base {

    public void screenshot() throws IOException {
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\soujanya.narlapuram\\IdeaProjects\\BookStoreApplication\\src\\test\\resources\\screenshots" + System.currentTimeMillis() + ".png");
        FileUtils.copyFile(src, destination);
    }
}
