package com.telran.trello.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AppManager {
    WebDriver wd;
    UserHelper userHelper;


    public void start() {
        //wd = new FirefoxDriver();
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        userHelper = new UserHelper(wd);


    }

    public void stop() {
        wd.quit();

    }


    public UserHelper user() {
        return userHelper;
    }
}
