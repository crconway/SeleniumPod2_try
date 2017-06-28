import org.junit.Assert;
import org.junit.Test;

/**
 * Created by crc07 on 6/27/17.
 */
public class MainTest {

    HomePage utils = new HomePage();

    public static final String URL = "http://homedepot.com";


    @Test
    public void startTestHere(){
        //Selenium Project Step 1
        Assert.assertTrue("Unable to navigate to home page " + URL, utils.navigateURL(URL));
        System.out.println("Navigated to " +URL);
        Assert.assertTrue("Search box not displayed", utils.validateSearchBox());
        System.out.println("Search Box displayed.");



        //Selenium Project Step 2


    }



}
