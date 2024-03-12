import java.util.Scanner;

class Year_2023_Q3 {
    String name;
    int age;
    double mks;
    String stream;

    void accept(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:-");
        name = sc.nextLine();

        System.out.println("Enter the age:-");
        age = sc.nextInt();

        System.out.println("Enter the marks:-");
        mks = sc.nextDouble();
    }

    void allocation(){
        if (mks < 75) {
            stream = "Try Again";
        }
        else if(mks >= 75 && mks < 200){
            stream = "Arts and Animation";
        }
        else if(mks >= 200 && mks < 300){
            stream = "Commerce and Computer";
        }
        else{
            stream = "Science and Computer";
        }
    }

    void print(){
        System.out.println("Name:- " + name);
        System.out.println("Age:- " + age);
        System.out.println("Stream:- " + stream);
        System.out.println("Marks:- " + mks);
    }

    public static void main(String args[]){
        Year_2023_Q3 obj = new Year_2023_Q3();
        obj.accept();
        obj.allocation();
        obj.print();
    }
}
