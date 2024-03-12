import java.util.*;

public class Year_2020_Q5 {
    public static int binarySearch(int[] array, int number) {
        int position = -1;
        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = (start + end)/2;

            if(array[mid] == number){
                position = mid;
                break;
            }

            if(array[mid] > number){
                end = mid - 1;
            }

            if(array[mid] < number){
                start = mid + 1;
            }
        }

        return position;
    }

    public static void main(String[] args) {
        int[] array = {31, 36, 45, 50, 60, 75, 86, 90};
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number to be searched: ");
        int number = sc.nextInt();

        int position = binarySearch(array, number);

        if(position == -1){
            System.out.println("Search Unsuccessful.");
        }
        else{
            System.out.println("Search Successful.");
            System.out.println("The number is at position: " + position);
        }
    }
}
