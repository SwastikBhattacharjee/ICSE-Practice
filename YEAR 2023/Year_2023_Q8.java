import java.util.Scanner;

public class Year_2023_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int one = 0;
        int two = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a value at index " + i + ": ");
            array[i] = sc.nextInt();

            if(array[i] >= 10 && array[i] < 100){
                two += array[i];
            }
            else if(array[i]>=0 && array[i]< 10){
                one += array[i];
            }
        }

        System.out.println("SUM OF ALL ONE DIGIT: " + one);
        System.out.println("SUM OF ALL TWO DIGIT: " + two);


    }
}
