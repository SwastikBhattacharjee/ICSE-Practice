import java.util.Scanner;

public class Year_2023_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double array[] = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Enter a value at index " + i + ": ");
            array[i] = sc.nextDouble();
        }

        System.out.println("Enter a value to search: ");
        double search = sc.nextDouble();

        int pos = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                pos = i;
                break;
            }
        }

        if (pos > -1) {
            System.out.println("\nElement FOund: " + pos);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
