import java.util.*;
class Patternd {
    public static void main(String[] args) {
        int n= 8;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <n; i++) {
            for (int j=1; j<n; j++) {
                if (i==1||i==n-1||j==1||j==n-1) {
                    System.out.print(" *");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}