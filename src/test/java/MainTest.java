import org.junit.Assert;
import org.junit.Test;

/**
 * Created by crc07 on 6/27/17.
 */
public class MainTest {

    LandingPage utils = new LandingPage();

    public static final String URL = "http://homedepot.com";
    public String item1 = "hammer";
    public String item2 = "screwdriver";


    @Test
    public void startTestHere(){
        //Selenium Project Step 1
        Assert.assertTrue("Unable to navigate to home page " + URL, utils.navigateURL(URL));
        System.out.println("Navigated to " +URL);
        Assert.assertTrue("Search box not displayed", utils.validateTextBox(utils.SEARCH_BOX));
        System.out.println("Search Box displayed");

        //Selenium Project Step 2

        Assert.assertTrue("Value can not be entered", utils.validateSearchBoxEnterText(item1));
        System.out.println("Search performed on "+ item1);
        Assert.assertTrue("Unable to verify Landing Page", utils.verifyItemLandingPage(item1));
        System.out.println("Landing Page "+ item1 +"verified");

    }



}
