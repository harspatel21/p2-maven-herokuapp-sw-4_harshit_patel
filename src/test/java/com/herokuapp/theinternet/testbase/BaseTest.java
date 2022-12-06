package com.herokuapp.theinternet.testbase;
// **** Created By Harshit Patel ****


import com.herokuapp.theinternet.propertyreader.PropertyReader;
import com.herokuapp.theinternet.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
