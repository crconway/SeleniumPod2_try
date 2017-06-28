/**
 * Created by crc07 on 6/27/17.
 */
public class HomePage extends SeleniumUtils {

    public static final String SEARCH_BOX = ".//input[@id='headerSearch']";

    public boolean validateSearchBox(){

        if(waitUntilElementDisplayed(SEARCH_BOX)){

            return true;
        }
        return false;
    }
}
