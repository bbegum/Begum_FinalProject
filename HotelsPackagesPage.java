package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.ArrayList;
import java.util.List;

public class HotelsPackagesPage extends BasePage {
  
  private By originField = By.xpath("//input[@id='package-origin-hp-package']");
    private By destinationField = By.xpath("//input[@id='package-destination-hp-package']");
    private By departureDate = By.xpath("//input[@id='package-departing-hp-package']");
    private By returnDate = By.xpath("//input[@id='package-returning-hp-package']");
    private By submitButton = By.xpath("//section[contains(@class,'package-form-fields')]//button[contains(@type,'submit')]");


    public void setOriginField(String text){
        setValue(originField, text );
    }
    public void setDestinationField(String text){
        setValue(destinationField, text );
    }
    public void setDepartureDate(String text){
        setValue(departureDate, text );
    }
    public void setReturnDate(String text){
        setValue(returnDate, text );
    }
    public void clickSubmitButton(){
        clickOn(submitButton);
    }
}











}
