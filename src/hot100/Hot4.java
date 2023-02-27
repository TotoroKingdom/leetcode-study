package hot100;

import java.util.Arrays;

/**
 * @author:totoro
 * @createDate:2023/2/24
 * @description:
 */
public class Hot4 {

    public static void main(String[] args) {

        int[] a = {1,3,4};
        int[] b = {2,5};
        findMedianSortedArrays(a,b);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //合并数组
        int l = nums1.length + nums2.length;
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            if (i<nums1.length){
                a[i] = nums1[i];
            }else {
                a[i] = nums2[i - nums1.length];
            }
        }
        //冒泡排序 把最小的放前面
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //取中位数
        if (a.length % 2 == 1){
           return a[a.length / 2];
        }
        return (a[a.length/2] + a[(a.length/2) - 1])/2.0;

    }


}
