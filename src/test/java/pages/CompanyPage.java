package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CompanyPage {
    private final SelenideElement
            goToCompany = $(byText("Компания")),
            scrollToWorkInX5 = $(".key-numbers__content"),
            checkNumberInText = $(withText("343000"));

    public CompanyPage openPage() {
        open("https://www.x5.ru/ru/");

        return this;
    }

    public CompanyPage chooseSectionCompany() {
        goToCompany.click();

        return this;
    }

    public CompanyPage scrollWorkingAtX5(Boolean value) {
        scrollToWorkInX5.scrollIntoView(value);

        return this;
    }

    public CompanyPage checkNumberOfEmployees() {
        checkNumberInText.shouldNot(exist);

        return this;
    }
}
