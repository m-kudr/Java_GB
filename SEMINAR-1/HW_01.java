//LeetCode: 1089. Duplicate Zeros
//Given a fixed-length integer array arr, duplicate each occurrence of zero,
//    shifting the remaining elements to the right.
//
//Note: that elements beyond the length of the original array are not written.
//    Do the above modifications to the input array in place and do not return anything.

//Example 1:
//Input: arr = [1,0,2,3,0,4,5,0]
//Output: [1,0,0,2,3,0,0,4]
//Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

//Example 2:
//Input: arr = [1,2,3]
//Output: [1,2,3]
//Explanation: After calling your function, the input array is modified to: [1,2,3]

import java.util.Arrays;

public class HW_01 {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr = new int[]{8, 4, 5, 0, 0, 0, 0, 7};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int arrLen = arr.length;
        int[] arrCopy = new int[arrLen];
        int smech = 0;
        if (!Arrays.equals(arr, arrCopy)) {
            for (int i = 0; i < arrLen - smech; i++) {
                if (arr[i] == 0 && i < arrLen - 1 && (i + smech + 1 < arrLen)) {
                    arrCopy[i + smech] = 0;
                    arrCopy[i + smech + 1] = 0;
                    smech++;
                } else
                    arrCopy[i + smech] = arr[i];
                System.out.println(i + " " + arrCopy[i]);
            }
            System.out.println(Arrays.toString(arrCopy));
            for (int i = 0; i < arrLen; i++) {
                arr[i] = arrCopy[i];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}