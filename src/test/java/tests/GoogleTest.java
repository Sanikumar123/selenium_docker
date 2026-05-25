package tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void openGoogle() {

        getDriver().get("https://www.google.com");

        System.out.println(
                Thread.currentThread().getId()
                        + " -> "
                        + getDriver().getTitle()
        );
    }
}