package com.telran.trello.fw;

import com.telran.trello.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {


    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void initLogin() {
        clickByCss("[href=\"/login\"]");
    }

    public void fillLoginForm(User user) throws InterruptedException {
        type(By.id("user"), user.getEmail());

       Thread.sleep(1000);

        click(By.id("login"));
        type(By.id("password"), user.getPassword());


    }

    public void confirmLogin() {
        click(By.cssSelector("[type=\"submit\"]"));
    }

    public boolean isAvatarPresent() throws InterruptedException {
        Thread.sleep(3000);
        return isElementPresent(By.xpath("//img[@class='_2hx57UFtqOV2rX']"));

           }
}
