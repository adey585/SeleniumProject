import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AccountFeature extends SubBase {

    public AccountFeature() throws IOException {
    }

    @Test (priority = 1, enabled = true)
    public void login() throws Exception {
        try {
            loginToAccount();
            //Assert.assertEquals(driver.getTitle(), "Dashboard");
            //takeTheScreenshot("test");
        } catch (Exception e) {
            takeTheScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
            Assert.fail();
        }
    }

//    @Test (priority = 2, enabled = false)
//    public void logout() throws InterruptedException {
//        loginToAccount();
//        logOutFromAccount();
//    }
//
//    @Test (priority = 3, enabled = false)
//    public void addAddress() throws InterruptedException {
//        loginToAccount();
//        addAddressTo();
//    }
}

//Test to see if it gets pushed to github

