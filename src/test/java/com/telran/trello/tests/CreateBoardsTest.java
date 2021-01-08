package com.telran.trello.tests;

import com.telran.trello.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateBoardsTest extends TestBase {


    @Test
    public void creatBoardsTest() throws InterruptedException {


        app.user().initLogin();
        app.user().fillLoginForm(new User()
                .withEmail("slonik-eli@mail.ru")
                .withtPassword("AB0543020630AB"));
        app.user().confirmLogin();
        app.user().pause(10000);

        app.user().click(By.cssSelector("span[class='nch-icon _2_Q6rrYCFblD3M _3Dk1GPoKnJxuep _1hS8KBZ_zkPTrz _1iYprMLTeGpyW9'] span[aria-label='AddIcon']"));
        app.user().click(By.cssSelector("li:nth-child(1) > button._2FCfpANq784raH:nth-child(1) > p"));
        app.user().type(By.cssSelector("input[placeholder='Add board title']"), "Strong1");
        app.user().click(By.xpath("//button[normalize-space()='Team Visible']"));
        app.user().click(By.cssSelector("ul:nth-child(1) > li:nth-child(1) > button"));
        app.user().click(By.xpath("//button[normalize-space()='Create Board']"));
        Assert.assertTrue(app.user().isElementPresent(By.cssSelector("input[value='Add List']")));

    }
}
