package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Driver;

public class GoogleHomePage {


    By search = By.name("q");

    By searchButton = By.name("btnK");


    public void searchFor(String searchKey){
        Driver.getDriver().findElement(search).sendKeys(searchKey );
    }

    public void clickSearchButton(){
        Driver.getDriver().findElement(search).submit();
    }
}
