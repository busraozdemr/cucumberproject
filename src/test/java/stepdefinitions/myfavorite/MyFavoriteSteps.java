package stepdefinitions.myfavorite;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.login.LoginPage;
import pages.myfavorite.MyFavoritePage;
import utils.Constants;

import java.util.List;
import java.util.Map;

import static factory.DriverFactory.getDriver;

public class MyFavoriteSteps {

    public MyFavoritePage myFavoritePage = new MyFavoritePage(DriverFactory.getDriver());

    @And("YS User search {string}")
    public void ysUserSearch(String text) {
        myFavoritePage.searchText(text)
                .clickSearchButton();
    }

    @And("YS User close banabi popup")
    public void ysUserCloseBanabiPopup() {
        myFavoritePage.closeBanabiPopup();
        
    }

    @And("YS User choose location {string}")
    public void ysUserChooseLocation(String addressArea) {
        myFavoritePage.chooseLocation(addressArea);
    }

    @And("YS User click first restaurant")
    public void ysUserClickFirstRestaurant() {
        myFavoritePage.clickFirstRestaurant();
    }

    @And("YS User click added my favorite restaurant")
    public void ysUserClickAddedMyFavoriteRestaurant() {
        myFavoritePage.clickAddedMyFavorite();
    }

    @Then("YS User should have {string}")
    public void ysUserShouldHave(String text) {
        myFavoritePage.shouldHaveTextAs(text);
    }

    @And("YS User click exit my favorite restaurant")
    public void ysUserClickExitMyFavoriteRestaurant() {
        myFavoritePage.clickExitMyFavorite();
    }
}
