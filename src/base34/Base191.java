package base34;

/**
 * @author:totoro
 * @createDate:2023/2/28
 * @description:
 */
public class Base191 {


    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0){
           n &= n-1;
            //n右移
           count++;
        }

        return count;
    }
}
