class Year_2023_Q5 {
    public static void main(String[] args) {
        Year_2023_Q5 obj = new Year_2023_Q5();

        obj.print();
        obj.print(3664);
    }

    void print(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    void print(int n){
        int x = n;
        int odd = 0;
        int even = 0;

        while(n > 0){
            int temp = n%10;

            if(temp%2 == 0){
                even += temp;
            }
            else{
                odd += temp;
            }

            n/=10;
        }

        if(odd == even){
            System.out.println("\n\n" + x + " is a lead number.");
        }
        else{
            System.out.println("\n\n" + x + " is not a lead number.");
        }
    }
}
