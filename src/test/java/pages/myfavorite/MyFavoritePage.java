package pages.myfavorite;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

import static factory.DriverFactory.getDriver;

public class MyFavoritePage extends ElementUtils {
    private By SEARCH_TEXTBOX = By.cssSelector(".form-control.search-box.ys-ac-opened");
    private By SEARCH_BUTTON = By.xpath("//*[contains(@class,'ys-btn-default search-button')]");
    private By BANABI_CLOSE_BUTTON = By.cssSelector(".banabi-delivery-info-close-button");
    private By LOCATION_BUTTON = By.cssSelector("#select2-ys-areaSelector-container");
    private By BANABI_POPUP = By.cssSelector(".banabi-delivery-info-image");
    private By FIRST_RESTAURANT_TEXT = By.cssSelector(".ys-result-items .ys-item:nth-child(1) .restaurant-main-info .head a");
    private By ADDED_MY_FAVORITE_BUTTON = By.xpath("//*[@class='social-button favorite-button add active']");
    private By EXIT_MY_FAVORITE_BUTTON = By.xpath("//*[@class='social-button favorite-button delete active']");

    public MyFavoritePage(WebDriver driver) {
        super(driver);
    }

    public MyFavoritePage searchText(String text) {
        visibilityOfElement(SEARCH_TEXTBOX);
        fill(SEARCH_TEXTBOX, text);
        return this;
    }

    public void clickSearchButton() {
        onClick(SEARCH_BUTTON);
    }

    public void closeBanabiPopup() {
        visibilityOfElement(BANABI_POPUP);
        onClick(BANABI_CLOSE_BUTTON);
    }

    public void chooseLocation(String addressArea) {
        onClick(LOCATION_BUTTON);
        onClick(By.xpath("//*[@class='address-option']//*[contains(text(),'" + addressArea + "')]"));
    }

    public void clickFirstRestaurant() {
        visibilityOfElement(FIRST_RESTAURANT_TEXT);
        onClick(FIRST_RESTAURANT_TEXT);
    }

    public void clickAddedMyFavorite() {
        waitForPageToCompleteState(getDriver());
        onClick(ADDED_MY_FAVORITE_BUTTON);
    }

    public void shouldHaveTextAs(String text) {
        visibilityOfElement(By.xpath("//*[contains(@class,'favorite-button')]//*[text()='" + text + "']"));
        String responseMessageText = getDriver().findElement(By.xpath("//*[contains(@class,'favorite-button')]//*[text()='" + text + "']")).getText();
        Assert.assertEquals("my favorite text message should be : " + text, text, responseMessageText);
    }

    public void clickExitMyFavorite() {
        onClick(EXIT_MY_FAVORITE_BUTTON);
    }
}
