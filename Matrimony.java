import java.util.*;

public class Matrimony {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String g1 = "male";
        String g2 = "female";

        System.out.println("Enter gender:");
        String gender = sc.next();

        System.out.println("Enter age:");
        int age = sc.nextInt();

        if (gender.equals(g1)) {
            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        } 
        else if (gender.equals(g2)) {
            if (age >= 18) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        } 
        else {
            System.out.println("Invalid gender");
        }

        sc.close();
    }
}