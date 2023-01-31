package co.com.demoblaze.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomeStorePage extends PageObject {
    public static  final Target BTN_SIGN_UP = Target.the("Btn for to begin sign up")
            .located(By.xpath("//a[@id='signin2']"));


    public static  final Target NICK_SIGN_UP_PLACE = Target.the("Nick sign up place")
            .located(By.xpath("//input[@id='sign-username']"));



}
