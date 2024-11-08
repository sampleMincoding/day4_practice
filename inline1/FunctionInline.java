

public class FunctionInline {
    boolean isSame(int a, int b) {
        return a == b;
    }
    boolean checkExistData(int[] arr, int targetNum){
        for(int i = 0 ; i < 10 ; ++i) {
            if(isSame(arr[i], 10)) {
                return true;
            }
        }
        return false;
    }
}
