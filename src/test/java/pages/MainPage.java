package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final SelenideElement

            searchIcon = $(".header-search__search-btn"),
            searchInput = $("#search-term-header"),
            scrollToSearchResult = $(".search-results__content-section"),
            resultShouldBe = $(withText("История компании")),
            chooseLanguage = $(".header__lang"),
            scrollToFooter = $(".css-ixvcfi-indicatorContainer"),
            checkAddressInFooter = $(".footer__address"),
            scrollToGetInTouch = $(byText("Обратная связь")),
            chooseRole = $(byText("Выберите роль")),
            chooseBuyer = $(byText("Я покупатель")),
            chooseCommercialNetwork = $(byText("Торговая сеть")),
            chooseShop = $(byText("Пятерочка")),
            setUserName = $("#input-text-10"),
            setUserEmail = $("#input-email-11"),
            setPhone = $("#input-tel-12"),
            setCity = $("#input-text-13"),
            setMessage = $("#textarea-14"),
            submitButton = $("#button-15"),
            feedbackModal = $(".x5-form__feedback--active");


    public MainPage openPage() {
        open(baseUrl);

        return this;
    }

    public MainPage clickSearchIcon() {
        searchIcon.click();

        return this;
    }

    public MainPage enterInSearchField(String value) {
        searchInput.setValue(value).pressEnter();

        return this;
    }

    public MainPage scrollToResultOfSearch(Boolean value) {
        scrollToSearchResult.scrollIntoView(value);

        return this;
    }

    public MainPage checkThatResultExist() {
        resultShouldBe.should(exist);

        return this;
    }

    public MainPage clickEnLang() {
        chooseLanguage.click();

        return this;
    }

    public MainPage goToFooter(Boolean value) {
        scrollToFooter.scrollIntoView(value);

        return this;
    }

    public MainPage checkAddress(String value) {
        checkAddressInFooter.shouldHave(text(value)).click();

        return this;
    }

    public MainPage scrollIntoViewForm(Boolean value) {
        scrollToGetInTouch.scrollIntoView(value);

        return this;
    }

    public MainPage setUserRole() {
        chooseRole.click();
        chooseBuyer.click();

        return this;
    }

    public MainPage setUserCommercialNetwork() {
        chooseCommercialNetwork.click();
        chooseShop.click();

        return this;
    }

    public MainPage setName(String value) {
        setUserName.setValue(value);

        return this;
    }

    public MainPage setEmail(String value) {
        setUserEmail.setValue(value);

        return this;
    }

    public MainPage setNumber(String value) {
        setPhone.setValue(value);

        return this;
    }

    public MainPage setUserCity(String value) {
        setCity.setValue(value);

        return this;
    }

    public MainPage setMessageText(String value) {
        setMessage.setValue(value);

        return this;
    }

    public MainPage clickButtonSubmit() {
        submitButton.click();

        return this;
    }

    public MainPage checkModalisOpen() {
        feedbackModal.shouldHave(exist);

        return this;
    }
}
