

import org.junit.Test;
import org.junit.Assert;
public class StringCalculator {
    public static int splitAndSum(String text) {
        int result = 0;

        if (text == null || text.isEmpty()) {
            result = 0;
        }
        else {
            String[] values = text.split("-");
            for (String value : values) {
                result += Integer.parseInt(value);
            }
        }
        return result;
    }
    @Test
    public void testSplitAndSum(){
        StringCalculator s = new StringCalculator();
        int ret = s.splitAndSum("55-22-33");
        Assert.assertEquals(110, ret);
    }
}
