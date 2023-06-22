package com.qapitol.test;

import com.qapitol.base.Base;
import com.qapitol.base.PropertyReader;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends Base
{
    Base bs=new Base();
    @BeforeSuite
    public void initial()
    {
        PropertyReader pr = new PropertyReader();
        pr.initialize();
        bs.setUp();
    }

    @AfterSuite
    public void endDriver()
    {
        bs.tearDown();
    }
}

