import java.util.HashMap;
import java.util.Map;

/**
 * Created by crc07 on 6/27/17.
 */
public class HomePage extends SeleniumUtils {

    public static final String SEARCH_BOX = ".//input[@id='headerSearch']";
    public static final String SEARCH_BUTTON = ".//button[@id='headerSearchButton']";
    static Map<String, String> productSearch = new HashMap<>();


    public boolean validateSearchBoxEnterText(String item) {

        if (enterTextIntoTextBox(SEARCH_BOX, item)) {
            //click button not working ON MY MACHINE left code to stay like class
            if (clickButton(SEARCH_BUTTON)) {
                return true;
            }
        }
        return false;
    }

    public String getDescription(String item)
    {
        return productSearch.get(item);
    }
    //recording description of item
    public void setDescription(String item, String desc)
    {
        productSearch.put(item, desc);
    }

}
