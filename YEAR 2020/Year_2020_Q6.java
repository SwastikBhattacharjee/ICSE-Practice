import java.util.Scanner;
class Year_2020_Q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String str = sc.nextLine().toUpperCase();

        for(int i=0; i<str.length(); i++){
            char character = str.charAt(i);
            if (character == ' ') {
                System.out.println("\n");
            }
            else{
                System.out.print(character);
            }
        }

        sc.close();
    }
}