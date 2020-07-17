package Replits;

import java.util.Arrays;

public class FindTheMissingNumber {

    public static int missingNumber(int[] arr) {
        int sum = 55;
        int sumOfar = 0;
        for (int i = 0; i < 9; i++) {
            sumOfar += arr[i];
        }
        int missing = sum - sumOfar;
        return missing;

    }

}
