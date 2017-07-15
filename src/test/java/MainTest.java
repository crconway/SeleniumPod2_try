import org.junit.Assert;
import org.junit.Test;

/**
 * Created by crc07 on 6/27/17.
 */
public class MainTest {

    StoreOverlay utils = new StoreOverlay();

    public static final String URL = "http://homedepot.com";
    public String item1 = "hammer";
    public int minValue = 10;
    public int maxValue = 15;
    public String item2 = "nail";
    public String item3 = "screwdriver";
    public String keyword = "Galvanized";



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
        System.out.println("Landing Page "+ item1 +" verified");

        //Selenium Project Step 3

        Assert.assertTrue(item1 + " between $"+ minValue + " and $" + maxValue + " could not be found", utils.validateItemDescriptionFromPrice(item1,minValue, maxValue));
        System.out.println( item1 + " between $"+ minValue + " and $" + maxValue + " was found and selected.");

        Assert.assertTrue(item1+ " description doesn't match cart", utils.verifyCartDescription(item1));
        System.out.println(item1 +" description matches the cart.");

        Assert.assertTrue(item1 +" not added to the cart", utils.verifyCartPage());
        System.out.println(item1 + " added to the cart");


        //Selenium Project Step 4


        Assert.assertTrue("Unable to verify Landing Page", utils.verifyItemLandingPage(item1));
        System.out.println("Landing Page "+ item1 +" verified after cart");

        //Selenium Project Step 5

        Assert.assertTrue("Value can not be entered", utils.validateSearchBoxEnterText(item2));
        System.out.println("Search performed on "+ item2);

        Assert.assertTrue("Unable to verify Landing Page", utils.verifyItemLandingPage(item2));
        System.out.println("Landing Page "+ item2 +" verified");

        Assert.assertTrue("Unable to verify " +keyword+ " "+ item2,utils.validateItemFromKeyword(item2,keyword));
        System.out.println("Verified "+ keyword + " "+ item2);

        Assert.assertTrue(item2+ " product page doesn't match "+ keyword, utils.verifyProductPage(keyword));
        System.out.println(item2 +" production page matches " + keyword);

        Assert.assertTrue("Unable to verify check nearby store link ", utils.validateNearbyStorelink());
        System.out.println("Verified check nearby store link");

    }



}
