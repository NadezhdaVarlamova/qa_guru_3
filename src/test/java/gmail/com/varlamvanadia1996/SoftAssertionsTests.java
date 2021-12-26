package gmail.com.varlamvanadia1996;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTests {

    @Test
    void successTests (){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".js-wiki-more-pages-link").click();
        $("[data-filterable-for = wiki-pages-filter]").$(byText("SoftAssertions")).shouldBe(visible).click();
        $(byText("Using JUnit5 extend test class:")).parent().sibling(0).shouldBe(visible);
    }
}
