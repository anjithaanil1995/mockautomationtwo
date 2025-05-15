package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EPage {

	WebDriver driver;

    public EPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.xpath("//input[@name='_nkw']");
    By categoryDropdown = By.xpath("//select[@name='_sacat']");
    By searchButton = By.id("gh-btn");

    public void searchProduct(String productName, String category) {
        driver.findElement(searchBox).sendKeys(productName);

        Select categorySelect = new Select(driver.findElement(categoryDropdown));
        categorySelect.selectByVisibleText(category);

        driver.findElement(searchButton).click();
    }
}
