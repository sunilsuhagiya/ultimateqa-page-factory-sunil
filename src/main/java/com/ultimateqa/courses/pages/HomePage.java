package com.ultimateqa.courses.pages;

import com.aventstack.extentreports.Status;
import com.ultimateqa.courses.customlisteners.CustomListeners;
import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//a[@href='/users/sign_in']")
    WebElement signInPage;

    public void clickOnSignInLink() {
        Reporter.log("Click on login" + signInPage.toString());
        clickOnElement(signInPage);
        CustomListeners.test.log(Status.PASS,"Enter Password ");

    }
}
