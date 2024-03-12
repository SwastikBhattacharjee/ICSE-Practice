import java.util.Scanner;

public class Year_2023_Q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 characters: ");

        char[] array = new char[10];

        for (int i = 0; i < 10; i++) {
            array[i] = sc.next().charAt(0);
        }

        System.out.println("\nSorted Array: ");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if ((int)array[j] > (int)array[j+1]) {
                    char temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}
