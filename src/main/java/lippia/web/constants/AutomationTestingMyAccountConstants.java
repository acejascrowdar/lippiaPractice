package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class AutomationTestingMyAccountConstants {

    public static final String USERNAME_LABEL = "id:username";
    public static final String PASSWORD_LABEL = "id:password";
    public static final String LOGIN_BUTTON = "xpath://*[@name='login']";
    public static final String MSJ_ERROR_USER_REQUIRED = "xpath://li[contains(.,'Username is required')]";
    public static final String MSJ_ERROR_PASSWORD_REQUIRED = "xpath://li[contains(.,'Password is required')]";
    public static final String SIGN_OUT_BUTTON = "xpath://a[contains(.,'Sign out')]";
}
