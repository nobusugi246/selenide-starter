import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelenideTest {
    @Test
    @DisplayName("Selenide sample test.")
    public void test() {
        open("https://www.google.co.jp/");
        $("#lst-ib").val("selenide").pressEnter();

        $(By.linkText("Selenide: concise UI tests in Java")).click();

        $("body").shouldHave(text("What is Selenide?"));
    }
}
