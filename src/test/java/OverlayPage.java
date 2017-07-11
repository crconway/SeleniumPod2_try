import org.openqa.selenium.By;

/**
 * Created by crc07 on 7/5/17.
 */
public class OverlayPage extends LandingPage {

    public static final String ADDED_TO_CART = ".//span[@class='u__husky' and text() = '1 Item Added to Cart']";
    public static final String CONTINUE_SHOPPING = ".//a[@class='u__default-link' and text() = 'Continue Shopping']";
    public static final String FRAME_OVERLAY = "(.//iframe[@class='thd-overlay-frame'])[2]";


    public boolean verifyCartPage(){
        switchDriver("iFrame", FRAME_OVERLAY);

        if(verifyLandingPage(ADDED_TO_CART)){
            driver.findElement(By.xpath(CONTINUE_SHOPPING)).click();
            switchDriver("","");
            return true;
        }
        return false;
    }




}
