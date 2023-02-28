package base34;

/**
 * @author:totoro
 * @createDate:2023/2/28
 * @description:
 */
public class Base1281 {
    public static void main(String[] args) {
        int n = 234;
        int i = subtractProductAndSum(234);
        System.out.println(i);
    }

    public static int subtractProductAndSum(int n) {

        int sum =0;
        int product=1;

        for(;;){
            int i = n % 10;
            sum = sum + i;
            product = product * i;
            n = n/10;
            if (n <= 0){
                break;
            }
        }
        return product - sum;
    }
}
