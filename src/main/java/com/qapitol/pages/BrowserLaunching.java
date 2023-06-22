package com.qapitol.pages;

import com.qapitol.base.Base;
import com.qapitol.base.PropertyReader;

public class BrowserLaunching extends Base {
    public void openWeb()
    {
        String hostName = PropertyReader.properties.getProperty("url");
        driver.get(hostName);

    }


}
