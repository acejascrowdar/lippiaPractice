package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationTestingMyAccountConstants;
import lippia.web.constants.GoogleConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TP6AutomationTestingMyAccountService extends ActionManager {

    public static void sendUser(String text) {
        setInput(AutomationTestingMyAccountConstants.USERNAME_LABEL, text);

    }

    public static void sendPassword(String text) {
        setInput(AutomationTestingMyAccountConstants.PASSWORD_LABEL, text);
    }

    public static void clickLogInButton() {
        click(AutomationTestingMyAccountConstants.LOGIN_BUTTON);
    }

    public static void isloggedIn() {
        isEnabled(AutomationTestingMyAccountConstants.SIGN_OUT_BUTTON);
    }

    public static void isNotloggedIn() {
        isEnabled(AutomationTestingMyAccountConstants.LOGIN_BUTTON);
    }

    public static void messageUserNameNotRegisteredAppears() {
        isEnabled(AutomationTestingMyAccountConstants.MSJ_ERROR_USER_REQUIRED);
    }

    public static void messagePasswordRequiredAppears() {
        isEnabled(AutomationTestingMyAccountConstants.MSJ_ERROR_PASSWORD_REQUIRED);
    }

}
