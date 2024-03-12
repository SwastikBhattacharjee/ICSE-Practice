public class Year_2020_Q7 {
    int Number(int num, int d){
        int frequency = 0;

        while(num > 0){
            int temp = num % 10;
            
            if(d == temp){
                frequency += 1;
            }

            num /= 10;
        }

        return frequency;
    }

    int Number(int n){
        int sum = 0;

        while(n > 0){
            int temp = n % 10;

            if(temp % 2 == 0){
                sum += temp;
            }

            n /= 10;
        }

        return sum;
    }

    public static void main(String args[]){
        int num = 2565685;
        int d = 5;
        int num2 = 29865;

        Year_2020_Q7 obj = new Year_2020_Q7();

        System.out.println(obj.Number(num2));
    }
}
