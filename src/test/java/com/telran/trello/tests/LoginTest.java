package com.telran.trello.tests;

import com.telran.trello.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void testAtlassianUserLogin() throws InterruptedException {
        attlasianLogin();

        Assert.assertTrue(app.user().isAvatarPresent());

    }

    public void attlasianLogin() throws InterruptedException {
        app.user().initLogin();
        app.user().fillLoginForm(new User()
        .withEmail("slonik-eli@mail.ru")
        .withtPassword("AB0543020630AB"));
        app.user().confirmLogin();
        app.user().pause(2000);
    }
}
