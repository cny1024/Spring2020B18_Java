package BosYapma;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

public class deneme12345 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};// 4,5,6,7,1,2,3
        int m = 3;


        System.out.println(Arrays.toString(rotateArray(arr, m)));


    }


    public static int[] rotateArray(int[] nums, int k) {
    /*    for (int i = 0; i < nums.length; i++) {
            if (k+1 != nums[0]) {
                int temp = nums[nums.length - 1];
                    nums[nums.length - 1] = nums[0];
                    for (int j = 0; j < nums.length; j++) {
                        if (j != nums.length - 1)
                            nums[j] = nums[j + 1];
                }
                nums[nums.length - 2] = temp;
            } else {
                break;
            }
        }
        return nums;
    }
}
*/

        do {
            int temp = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1) {
                    continue;
                }
                nums[i] = nums[i + 1];
            }

            nums[nums.length - 1] = temp;

        } while (k + 1 != nums[0]);

        return nums;

    }

}

