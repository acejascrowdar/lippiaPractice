package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AutomationTestingHomeConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class TP6AutomationTestingHomeService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("https://practice.automationtesting.in"));
    }

    public static void clickMyAccountButton() {
        click(AutomationTestingHomeConstants.MY_ACCOUNT_BUTTON);
    }
}
