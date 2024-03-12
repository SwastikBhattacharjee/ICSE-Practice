import java.util.Scanner;

public class Year_2020_Q8 {
    public static void PrintSeries(){
        for (int i = 1; i <= 20; i++) {
            System.out.println(Math.pow(i, 2) + (2 * i * 3));
        }
    }

    public static void PrintPattern(){
        for(int i = 1; i <= 5; i++){
            for (int j = 0; j < i; j++) {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type 1 for Series and 2 for Pattern:");
        int n = sc.nextInt();

        switch(n){
            case 1:
                PrintSeries();
                break;
            
            case 2:
                PrintPattern();
                break;
            default:
                System.out.println("You did not enter 1 or 2!");
                break;
        }
    }
}
