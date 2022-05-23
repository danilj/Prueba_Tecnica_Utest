package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UtestForm extends PageObject {
    public static final Target FIELD_NAME = Target.the("field to write the name of the user").located(By.id("firstName"));
    public static final Target FIELD_LASTNAME = Target.the("field to write the last name of the user").located(By.id("lastName"));
    public static final Target FIELD_EMAIL = Target.the("field to write the user's email").located(By.id("email"));
    public static final Target COMBO_MONTH = Target.the("combo box to select de month of birth").located(By.id("birthMonth"));
    public static final Target COMBO_DAY = Target.the("combo box to select the day of birth").located(By.id("birthDay"));
    public static final Target COMBO_YEAR = Target.the("combo box to select the year of birth").located(By.id("birthYear"));
    public static final Target LANGUAGES = Target.the("select the language").located(By.id("languages"));
    public static final Target NEXT_BUTTON = Target.the("next button").located(By.xpath("//span[text()='Next: Location']"));
    public static final Target CITY = Target.the("select the city").located(By.id("city"));
    public static final Target ZIP = Target.the("enter the ZIP").located(By.id("zip"));
    public static final Target COUNTRY = Target.the("select the country").located(By.xpath("//span[text()='Colombia']"));
    public static final Target DEVICES = Target.the("button to continue with the registration").located(By.xpath("//span[text()='Next: Devices']"));
    public static final Target MOBILE = Target.the("enter name mobile").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MODEL = Target.the("enter model mobile").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SYSTEM = Target.the("enter system mobile").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target LASTSTEP = Target.the("button to continue with the registration").located(By.xpath("//span[text()='Next: Last Step']"));
    public static final Target PASSWORD = Target.the("enter the password").located(By.id("password"));
    public static final Target CONFIRM = Target.the("enter the confirm password").located(By.id("confirmPassword"));
    public static final Target CHECK1 = Target.the("select accept").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK2 = Target.the("select accept").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK3 = Target.the("select accept").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE = Target.the("button to continue with the registration").located(By.id("laddaBtn"));
}
