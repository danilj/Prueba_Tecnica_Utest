package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestJoinToday extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//a[text()='Join Today']"));
    public static final Target SUCCESSFULL_BUTTON = Target.the("validate correct registration").located(By.id("laddaBtn"));
}
