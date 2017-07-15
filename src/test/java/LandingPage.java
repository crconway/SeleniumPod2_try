import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by crc07 on 6/29/17.
 */
public class LandingPage extends HomePage {

    public static final String LANDING_PAGE = ".//span[@class = 'original-keyword u__regular' and contains(text(), 'TO_REPLACE')]";
    public static final String WRAPPER = ".//div[contains(@class,'plp-pod plp-pod--default pod-item--')]";
    public static final String PRICE = ".//div[@class='price']";
    public static final String DESCRIPTION = ".//div[@class='pod-plp__description js-podclick-analytics']//a";
    public static final String ADD_TO_CART = ".//span[@class='bttn__content' and text() = 'Add To Cart']";

    public boolean verifyItemLandingPage(String item) {

        if (verifyLandingPage(insertTextIntoXpath(LANDING_PAGE, item))) {
            return true;
        }
         return false;

    }

    public boolean validateItemDescriptionFromPrice(String item, int min, int max){
        if(waitUntilElementDisplayed(WRAPPER)){
            //List<WebElement> list = driver.findElements(By.xpath(WRAPPER));

            for (WebElement element:getElements(WRAPPER)) {
                String price = element.findElement(By.xpath(PRICE)).getText();
                int thePrice = Integer.parseInt(price.replaceAll("[^0-9]", ""))/100;
                if(thePrice >= min && thePrice < max){
                    String desc = element.findElement(By.xpath(DESCRIPTION)).getText();
                    //left in here for debug purpose at this time
                    System.out.println("Item description: "+ desc);
                    System.out.println("Item price: "+ thePrice);
                    //adding item to the map
                    setDescription(item, desc);
                    element.findElement(By.xpath(ADD_TO_CART)).click();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validateItemFromKeyword(String item, String keyword) {
        keyword = keyword.toLowerCase();

        if (waitUntilElementDisplayed(WRAPPER)) {
            for (WebElement element : getElements(WRAPPER)) {
                WebElement descElement = element.findElement(By.xpath(DESCRIPTION));
                String desc = descElement.getText();
                if (desc.toLowerCase().contains(keyword)) {
                    //left in here for debug purpose at this time
                    System.out.println("Item description: " + desc);
                    //adding item to the map
                    setDescription(item, desc);
                    descElement.click();

                    return true;
                }

            }
        }
        return false;
    }

}
