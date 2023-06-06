package test;

import org.junit.jupiter.api.*;
import pages.MainPage;

import static io.qameta.allure.Allure.step;
import static test.TestData.*;

@Tag("X5Group")
public class MainPageTest extends TestBase  {
    MainPage mainPage = new MainPage();
    @Test
    @DisplayName("Проверка работы поиска")
    public void checkSearchResult() {
        step("Открываем главную страницу", () -> {
            mainPage.openPage();
        });
        step("Кликаем по значку поиска", () -> {
            mainPage.clickSearchIcon();
        });
        step("Вводим в поле поиска значение 'Открытие'", () -> {
            mainPage.enterInSearchField(searchWord);
        });
        step("Скроллим страницу до результатов поиска", () -> {
            mainPage.scrollToResultOfSearch(true);
        });
        step("Проверяем, что по поиску находится статья под названием 'История компании'", () -> {
            mainPage.checkThatResultExist();
        });
    }

    @Test
    @Disabled
    @DisplayName("По клику на 'EN' сайт переходит на английский")
    public void skippedTestCheckingTranslation() {
        step("Открываем главную страницу", () -> {
            mainPage.openPage();
        });
        step("Кликаем по кнопке 'EN' в главном меню справа", () -> {
            mainPage.clickEnLang();
        });
        step("Скроллим до футера", () -> {
            mainPage.goToFooter(true);
        });
        step("Проверяем, что на адресс компании отображается на английском", () -> {
            mainPage.checkAddress(address);
        });
    }

    @Test
    @DisplayName("Проверка формы 'Обратная связь'")
    public void checkGetInTouchSectionConsumer() {
        step("Открываем главную страницу", () -> {
            mainPage.openPage();
        });
        step("Скроллим до формы 'Обратная связь'", () -> {
            mainPage.scrollIntoViewForm(true);
        });
        step("Выбираем в списке ролей 'Я покупатель'", () -> {
            mainPage.setUserRole();
        });
        step("Выбираем торговую сеть", () -> {
            mainPage.setUserCommercialNetwork();
        });
        step("Вводим ФИО", () -> {
            mainPage.setName(userName);
        });
        step("Вводим email", () -> {
            mainPage.setEmail(userEmail);
        });
        step("Вводим телефон", () -> {
            mainPage.setNumber(userPhoneNumber);
        });
        step("Вводим город", () -> {
            mainPage.setUserCity(city);
        });
        step("Вводим обращение", () -> {
            mainPage.setMessageText(messageText);
        });
        step("Нажимаем кнопку 'Отправить'", () -> {
            mainPage.clickButtonSubmit();
        });
        step("Проверяем, что открылось окно с подтверждением отправки", () -> {
            mainPage.checkModalisOpen();
        });
    }

}

