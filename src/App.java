import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int distance,age,trip;
        double normal_price,price;

        System.out.println("Enter distance:");
        distance = input.nextInt();

        System.out.println("Enter age:");
        age = input.nextInt();  

        System.out.println("Type of trip: (1 => one-way   2 => round trip)");
        trip = input.nextInt();

        price = distance * 0.1;
        
        if (age<12){
            price-=price*0.5;
        }else if(age>12 && age<24){
            price-=price*0.1;
        }else if(age>65){
            price-= price*0.3;
        }

        if(trip == 2){
           price-= price * 0.2;
        }

        System.out.println("Total amount: " + price);
        

    }
}
