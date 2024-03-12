import java.util.Scanner;
public class Year_2020_Q4 {
    String Car_type;
    double km;
    double bill;

    Year_2020_Q4(){
        Car_type = " ";
        km = 0.0;
        bill = 0.0;
    }

    void accept(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the type of car(AC/NON AC): ");
        Car_type = sc.nextLine().trim().toUpperCase();

        System.out.print("\nEnter the number of kilometers travelled: ");
        km = sc.nextDouble();

        sc.close();
    }

    void calculate(){
        switch(Car_type){
            case "AC":
                bill = 150.0;

                for (int i = 0; i < km - 5; i++) {
                    bill += 10.0;
                }

                break;

            case "NON AC":
                bill = 120.0;

                for (int i = 0; i < km - 5; i++) {
                    bill += 8.0;
                }

                break;
        }
    }

    void display(){
        System.out.println("The car type is: " + Car_type);
        System.out.println("The number of kilometers travelled is: " + km);
        System.out.println("The bill is: " + bill);
    }

    public static void main(String[] args) {
        Year_2020_Q4 obj = new Year_2020_Q4();

        obj.accept();
        obj.calculate();
        obj.display();
    }
}
