package framework.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CommonActions {
    WebDriver driver;
    public WebDriverWait wait;
        public CommonActions(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Ajusta el timeout según sea necesario
        }

        public void click(By selector) {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
            element.click();
        }

        public void enterText(By selector, String text) {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            element.clear();
            element.sendKeys(text);
        }

        public String getText(By selector) {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            return element.getText();
        }

        public boolean isElementPresent(By selector) {
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(selector));
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public boolean isElementVisible(By selector) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
                return true;
            } catch (Exception e) {
                return false;
            }
        }

        public void waitForElementToBeInvisible(By selector) {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(selector));
        }

        public WebElement waitForElementToBePresent(By selector) {
            return wait.until(ExpectedConditions.presenceOfElementLocated(selector));
        }

        public WebElement waitForElementToBeClickable(By selector) {
            return wait.until(ExpectedConditions.elementToBeClickable(selector));
        }

        public WebElement waitForElementToBeVisible(By selector) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
        }

        public void selectDropdownOption(By selector, String optionText) {
            WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            dropdown.click();
            By optionSelector = By.xpath(String.format("//option[text()='%s']", optionText));
            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionSelector));
            option.click();
        }

        public void scrollToElement(By selector) {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        }

        public void hoverOverElement(By selector) {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(selector));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
        }

        public void waitForTextToBePresentInElement(By selector, String text) {
            wait.until(ExpectedConditions.textToBePresentInElementLocated(selector, text));
        }

        public List<WebElement> findElements(By selector) {
            return driver.findElements(selector);
        }

        public void waitAndClick(By selector) {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
            element.click();
        }
}

