package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.PressCenterPage;

import static io.qameta.allure.Allure.step;
import static test.TestData.userEmail;

@Tag("X5Group")
public class PressCenterPageTest extends TestBase{
    PressCenterPage pressCenterPage = new PressCenterPage();
    @Test
    @DisplayName("Проверка формы подписки на рассылку новостей")
    public void checkOrder() {
        step("Открываем главную страницу", () -> {
            pressCenterPage.openPage();
        });
        step("Переходим в раздел 'Пресс-центр'", () -> {
            pressCenterPage.goToPressCenterPage();
        });
        step("Скроллим страницу до поля 'E-mail'", () -> {
            pressCenterPage.scrollToEmail(true);
        });
        step("Вводим в поле 'E-mail электронный адрес ", () -> {
            pressCenterPage.setUserEmail(userEmail);
        });
        step("Нажимаем кнопку 'Подписаться'", () -> {
            pressCenterPage.subscribeNews();
        });
        step("Проверяем, что появилось окно с уведомлением об успешной подписке", () -> {
            pressCenterPage.checkModalWindow();
        });
    }

}
