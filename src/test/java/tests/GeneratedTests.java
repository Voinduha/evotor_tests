package tests;

import com.codeborne.selenide.Condition;
import helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Эвотор")
    void generatedTest() {
        step("Открываем страницу Эвотор", () -> {
            open("");

        step("Проверяем, что на странице есть раздел 'Маркировка'");
            $("#grey-tiles").shouldHave(Condition.text("Маркировка"));
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://evotor.ru/'", () ->
                open(""));

        step("Проверяем, что на главной странице есть текст: 'Эвотор - официальный сайт | Онлайн-кассы для малого бизнеса от производителя'", () -> {
            String expectedTitle = "Эвотор - официальный сайт | Онлайн-кассы для малого бизнеса от производителя";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Проверяем, что в консоле браузера нет ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем страницу Эвотор'", () ->
                open(""));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}