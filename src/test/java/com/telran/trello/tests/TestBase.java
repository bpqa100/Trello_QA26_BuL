package com.telran.trello.tests;


import com.telran.trello.fw.AppManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected AppManager app = new AppManager();

    @BeforeClass
    public void setUp() {
        app.start();
    }

    @AfterClass(enabled = false)
    public void tearDown() {
        app.stop();
    }
}
