import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.Thread.sleep;

public class Facade {

    public static void closeCustomPopup() throws InterruptedException {
        sleep(2000);
        SelenideElement closePopUpbutton = $("#onetrust-accept-btn-handler");
        if (closePopUpbutton.isDisplayed()) {
            closePopUpbutton.click();
        } else {
            System.out.println("Cookie pop-up is not visible");
        }
    }
}
