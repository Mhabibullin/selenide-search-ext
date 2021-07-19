package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;

    }

    @Test
    void positiveFillTest() {
        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("Egorov@mail.ru");
        $("#currentAddress").setValue("Street 2");
        $("#permanentAddress").setValue("Street 1");
        $("#submit").click();

        $("#name").shouldHave(text("Alex"));
        $("#email").shouldHave(text("Egorov@mail.ru"));
        $("#currentAddress", 1).shouldHave(text("Street 2"));
        $("#permanentAddress", 1).shouldHave(text("Street 1"));

    }

}
