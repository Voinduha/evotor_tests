package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPageTest extends TestBase {
    @Test
    @Description("Soon to be implemented by me (or QA engineers)")
    @DisplayName("В шапке на главной странице расположены ссылки: 'Онлайн-кассы', 'Сервисы для бизнеса', 'Поддержка'," +
            " 'О компании', 'Наша сеть'" )

    void blocksLoadedTest() {

        step("Открываем url 'https://dot-dot.ru/'", () ->
                open(""));

        step("Проверяем, что на странице видна ссылка 'Онлайн-кассы'", () -> {
            $("#menu-glavnoe-menyu").shouldHave(text("Онлайн-кассы")).shouldBe(visible);
        });

        step("Проверяем, что на странице видна ссылка 'Сервисы для бизнеса'", () -> {
            $("#menu-glavnoe-menyu").shouldHave(text("Сервисы для бизнеса")).shouldBe(visible);
        });

        step("Проверяем, что на странице видна ссылка 'Поддержка'", () -> {
            $("#menu-glavnoe-menyu").shouldHave(text("Поддержка")).shouldBe(visible);
        });

        step("Проверяем, что на странице видна ссылка 'О компании'", () -> {
            $("#menu-glavnoe-menyu").shouldHave(text("О компании")).shouldBe(visible);
        });

        step("Проверяем, что на странице видна ссылка 'Наша сеть'", () -> {
            $("#menu-glavnoe-menyu").shouldHave(text("Наша сеть")).shouldBe(visible);
        });

    }
}
