package com.booking.bot.utility;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Arrays;
import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;

public class mobileUtilObject {


    public void waitVisibleElement(WebDriver driver, WebElement element){
        new WebDriverWait(driver, 50, 80).until(ExpectedConditions.visibilityOf(element));
    }
    public static void click(WebDriver driver, WebElement element) throws Throwable {
        try {
            new WebDriverWait(driver, 40, 80).until(ExpectedConditions.visibilityOf(element)).click();
        } catch (Throwable t) {
            driver.close();
            throw t;
        }
    }

    public static void sendKeyValue(WebDriver driver, WebElement element, String value) throws Throwable {
        try {
             new WebDriverWait(driver, 40, 80).until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
        } catch (Throwable t) {
            driver.close();
            throw t;
        }
    }

    private final static PointerInput FINGER = new PointerInput(TOUCH, "finger");
    public static void doSwipe(AppiumDriver driver, Point start, Point end, int duration) {
        Sequence swipe = new Sequence(FINGER, 1)
                .addAction(FINGER.createPointerMove(ofMillis(0), viewport(), start.getX(), start.getY()))
                .addAction(FINGER.createPointerDown(LEFT.asArg()))
                .addAction(FINGER.createPointerMove(ofMillis(duration), viewport(), end.getX(), end.getY()))
                .addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));
    }

}