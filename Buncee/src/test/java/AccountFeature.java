import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class AccountFeature extends SubBase {

    public AccountFeature() throws IOException {
    }

    @Test(priority = 1, enabled = true)
    public void login() throws Exception {
        try {
            loginToAccount();
            //Assert.assertEquals(driver.getTitle(), "Dashboard");
            //takeTheScreenshot("test");
        } catch (Exception e) {
            takeTheScreenshot(new Object() {
            }.getClass().getEnclosingMethod().getName());
            Assert.fail();
        }
    }

    @Test(enabled = false)
    public void logout() throws InterruptedException {
        loginToAccount();
        logOutFromAccount();
    }

    @Test(enabled = false)
    public void addAddress() throws InterruptedException {
        loginToAccount();
        addAddressTo();
    }
}



