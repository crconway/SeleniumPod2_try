/**
 * Created by crc07 on 6/27/17.
 */
public class HomePage extends SeleniumUtils {

    public static final String SEARCH_BOX = ".//input[@id='headerSearch']";
    public static final String SEARCH_BUTTON = ".//button[@id='headerSearchButton']";


    public boolean validateSearchBoxEnterText(String item) {

        if (enterTextIntoTextBox(SEARCH_BOX, item)) {
            //click button not working ON MY MACHINE left code to stay like class
            if (clickButton(SEARCH_BUTTON)) {
                return true;
            }
        }
        return false;
    }
}
