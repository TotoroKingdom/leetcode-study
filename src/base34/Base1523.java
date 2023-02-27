package base34;

import java.util.ArrayList;

/**
 * @author:totoro
 * @createDate:2023/2/27
 * @description:
 */
public class Base1523 {

    public static void main(String[] args) {
        System.out.println(15&1);
    }

    public static int countOdds(int low, int high) {

        int count = 0;

        count = (high-low)/2;

        if (high%2 == 1 || low%2 == 1){
            count++;
        }
        return count;
    }


}
