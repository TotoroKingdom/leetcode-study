package base34;

/**
 * @author:totoro
 * @createDate:2023/2/27
 * @description:
 */
public class Base1491 {

    public static void main(String[] args) {
        int[] a = new int[]{48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};

        double average = average(a);
        System.out.println(average);
    }

    public static double average(int[] salary) {

        int max = salary[1];
        int min = salary[1];
        int sum = 0;
        double average = 0;

        for (int i = 0; i < salary.length; i++) {

            if (salary[i] > max){
                max = salary[i];
            }

            if (salary[i] < min){
                min = salary[i];
            }
            sum = sum + salary[i];
        }
        average = (sum - max - min)*1.0   / (salary.length - 2);
        return average;
    }


}
