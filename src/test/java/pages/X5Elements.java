package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class X5Elements {
    private final SelenideElement
            searchIcon = $(".header-search__search-btn"),
            searchInput = $("#search-term-header"),
            scrollToSearchResult = $(".search-results__content-section"),
            resultShouldBe = $(withText("История компании")),
            goToCareer = $(".header--active"),
            scrollToCareer = $(".text-w-media--reverse"),
            checkText = $(withText("Наша миссия — улучшать качество жизни людей")),
            scrollToConsumer = $(".block-header__heading-wrap"),
            chooseSection = $(".buyer__text-content"),
            scrollToNews = $(".news-block__head"),
            goToAllPublication = $(".news-block__controlls"),
            chooseFirstPublication = $("#splide01-slide01"),
            scrollToFile = $(".docslist__docs--tile"),
            downloadFile = $(".button-link-trigger-hover"),
            goToCompany = $(byText("Компания")),
            scrollToWorkInX5 = $(".key-numbers__content"),
            checkNumberInText = $(withText("343000")),
            chooseLanguage = $(".header__lang"),
            scrollToFooter = $(".css-ixvcfi-indicatorContainer"),
            checkAddressInFooter = $(".footer__address");

    public X5Elements openPage() {
        open("https://www.x5.ru/ru/");

        return this;
    }

    public X5Elements clickSearchIcon() {
        searchIcon.click();

        return this;
    }

    public X5Elements enterInSearchField(String value) {
        searchInput.setValue(value).pressEnter();

        return this;
    }

    public X5Elements scrollToResultOfSearch(Boolean value) {
        scrollToSearchResult.scrollIntoView(value);

        return this;
    }

    public X5Elements checkThatResultExist() {
        resultShouldBe.should(exist);

        return this;
    }

    public X5Elements chooseSectionCareer(String value) {
        goToCareer.shouldHave(text(value)).click();

        return this;
    }

    public X5Elements scrollIntoView(Boolean value) {
        scrollToCareer.scrollIntoView(value);

        return this;
    }

    public X5Elements checkTextMission(String value) {
        checkText.shouldHave(text(value)).should(exist);

        return this;
    }

    public X5Elements scrollSectionConsumer(Boolean value) {
        scrollToConsumer.scrollIntoView(value);

        return this;
    }

    public X5Elements choosePlanning(String value) {
        chooseSection.shouldHave(text(value)).click();

        return this;
    }

    public X5Elements scrollSectionNews(Boolean value) {
        scrollToNews.scrollIntoView(value);

        return this;
    }

    public X5Elements clickAllPublication(String value) {
        goToAllPublication.shouldHave(text(value)).click();

        return this;
    }

    public X5Elements getFistPublication() {
        chooseFirstPublication.click();

        return this;
    }

    public X5Elements downloadingPressRelease(Boolean value) throws FileNotFoundException {
        scrollToFile.scrollIntoView(value);
        File file = downloadFile.download();
        Assertions.assertTrue(file.exists());

        return this;
    }

    public X5Elements chooseSectionCompany() {
        goToCompany.click();

        return this;
    }

    public X5Elements scrollWorkingAtX5(Boolean value) {
        scrollToWorkInX5.scrollIntoView(value);

        return this;
    }

    public X5Elements checkNumberOfEmployees() {
        checkNumberInText.shouldNot(exist);

        return this;
    }

    public X5Elements clickEnLang() {
        chooseLanguage.click();

        return this;
    }

    public X5Elements goToFooter(Boolean value) {
        scrollToFooter.scrollIntoView(value);

        return this;
    }

    public X5Elements checkAddress(String value) {
        checkAddressInFooter.shouldHave(text(value)).click();

        return this;
    }
}
