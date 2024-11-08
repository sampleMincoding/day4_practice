
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionDelegation {
    public int accSumAndSquare(){
        return accSum() * accSum();
    }
    public int accSum(){
        int result = 0 ;
        for(int num = 1 ; num <= 100; ++num) {
            result += num;
        }
        return result;
    }

    @Test
    public void test_acc_sum(){
        FunctionDelegation instance = new FunctionDelegation();
        int ret = instance.accSum();
        assertEquals(ret, 5050);
    }

    @Test
    public void test_accumulated_sum_multiplication(){
        FunctionDelegation instance = new FunctionDelegation();
        int ret = instance.accSumAndSquare();
        assertEquals(ret, 5050 * 5050);
    }

}
