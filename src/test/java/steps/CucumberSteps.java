package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tests.BaseTest;

import java.io.IOException;
import java.util.Map;

public class CucumberSteps extends BaseTest {

    Map<String,String> data;

    @Before
    public void initCucumber(){
        init("Chrome","95",30);
    }

    @After
    public void tearDown() throws IOException {
        reportScreenshot("Test", "TestAllure");
        quitDriver();
    }

}
