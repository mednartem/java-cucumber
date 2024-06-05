package support;

import io.cucumber.java.After;

public class Hook {

    @After
    public void after() {
        DriverFactory.closeDriver();
    }
}
