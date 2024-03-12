import java.util.Scanner;

public class Year_2023_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        int d = 0;
        int a = 0;
        int s = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                d++;
            }
            else if(Character.isLetter(str.charAt(i))){
                a++;
            }
            else{
                s++;
            }
        }

        System.out.println("NUMBER OF DIGITS: " + d);
        System.out.println("NUMBER OF ALPHABETS: " + a);
        System.out.println("NUMBER OF SPECIAL CHARCATERS: " + s);

        sc.close();
    }
}
