package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PressCenterPage {
    private final SelenideElement
            goToPressCenter = $(byText("Пресс-центр")),
            scrollToEmail = $(".input--type-email"),
            setEmail = $("#input-email-3"),
            subscribeButton = $("#button-4"),
            successfulSubscribe = $(byText("Вы будете добавлены в список рассылки новостей для инвесторов X5 Group."));


    public PressCenterPage openPage() {
        open(baseUrl);

        return this;
    }

    public PressCenterPage goToPressCenterPage() {
        goToPressCenter.click();

        return this;
    }

    public PressCenterPage scrollToEmail(Boolean value) {
        scrollToEmail.scrollIntoView(value);

        return this;
    }

    public PressCenterPage setUserEmail(String email) {
        setEmail.setValue(email);

        return this;
    }

    public PressCenterPage subscribeNews() {
        subscribeButton.click();

        return this;
    }

    public PressCenterPage checkModalWindow() {
        successfulSubscribe.shouldBe(exist);

        return this;
    }
}
