/**
 * Created by crc07 on 6/29/17.
 */
public class LandingPage extends HomePage {

    public static final String LANDING_PAGE = ".//span[@class = 'original-keyword u__regular' and contains(text(), 'XXX')]";

    public boolean verifyItemLandingPage(String item) {

        if (verifyLandingPage(insertTextIntoXpath(LANDING_PAGE, item))) {
            return true;
        }
         return false;

    }

}
