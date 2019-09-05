package net.serenitybdd.tutorials.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.steps.NavigatingUser;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NavigatingUser mark;

    @Managed
    WebDriver browser;
    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        //browser = new ChromeDriver();
        //browser.manage().window().maximize();
        // Given
        mark.isOnTheHomePage();

        // When
        mark.navigatesToCategory(Category.Motors);

        // Then
        mark.shouldSeePageTitleContaining("New & Used Cars");
    }
}
