public class Year_2019_Q9 {
    public static void main(String[] args) {
        for (int x = 1000; x < 10000; x++) {
            int i = x;
            int first = 0;
            int last = 0;
            
            int change = 0;

            while (i > 0) {
                int temp = i%10;
                change++;

                switch (change) {
                    case 1:
                        last += 10*temp;
                        break;

                    case 2:
                        last += temp;
                        break;

                    case 3:
                        first += 10*temp;
                        break;

                    case 4:
                        first += temp;
                        break;

                }

                i /= 10;
            }

            
            int sum = (first + last) * (first+last);
            
            if(sum == x){
                System.out.println(x);
            }
        }
    }
}
