package com.booking.bot.helpers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;



public class BaseDriver extends PageObject {

    public AndroidDriver androidDriver() {
        return (AndroidDriver)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }

    public AppiumDriver appiumDriver() {
        return (AppiumDriver)
                ((WebDriverFacade) getDriver()).getProxiedDriver();
    }
}
