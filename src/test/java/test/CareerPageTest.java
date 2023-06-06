package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CareerPage;

import static io.qameta.allure.Allure.step;


@Tag("X5Group")
public class CareerPageTest extends TestBase{
     CareerPage careerPage = new CareerPage();

    @Test
    @DisplayName("Проверка, что в разделе 'Карьера' есть описание миссии компании")
    public void checkCareerSectionTest() {
        step("Открываем главную страницу", () -> {
            careerPage.openPage();
        });
        step("Переходим в раздел 'Карьера'", () -> {
            careerPage.chooseSectionCareer("Карьера");
        });
        step("Скроллим до раздела 'Работа в X5 Group'", () -> {
            careerPage.scrollIntoView(true);
        });
        step("Проверяем, что на странице есть текст: 'Наша миссия — улучшать качество жизни людей'", () -> {
            careerPage.checkTextMission("Наша миссия — улучшать качество жизни людей");
        });
    }

}
