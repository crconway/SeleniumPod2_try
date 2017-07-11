/**
 * Created by crc07 on 7/5/17.
 */
public class OverlayPage extends LandingPage {

    public static String ADDED_TO_CART = ".//span[@class='u__husky' and text() = '1 Item Added to Cart']";
    public static String CONTINUE_SHOPPING = ".//a[@class='u__default-link' and text() = 'Continue Shopping']";


    public boolean verifyCartPage(){
        //switchDriver("iFrame", FRAMRE);

        if(verifyLandingPage(ADDED_TO_CART)){
            return true;
        }
        return false;
    }




}
