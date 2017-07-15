import org.openqa.selenium.By;

/**
 * Created by crc07 on 7/13/17.
 */
public class ProductInfoPage extends OverlayPage {

    public static final String NEARBY_STORE = ".//a[@class='u__default-link store-inventory-finder-trigger']";
    public static final String PRODUCT_TITLE = ".//h1[@class='product-title__title'and contains(text(), 'TO_REPLACE')]]";


    public boolean verifyProductPage(String keyword) {

        if (verifyLandingPage(insertTextIntoXpath(PRODUCT_TITLE, keyword))) {
            return true;
        }
        return false;

    }

    public boolean validateNearbyStorelink(){

        if(waitUntilElementDisplayed(NEARBY_STORE)){
            driver.findElement(By.xpath(NEARBY_STORE)).click();
            return true;
        }
        return false;
   }

}
