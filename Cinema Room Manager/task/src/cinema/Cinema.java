package cinema;

import java.util.Scanner;

public class Cinema {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int a = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int b = scanner.nextInt();

        if (a * b <= 60){
            System.out.println("Total income:");
            System.out.println("$" + a * b * 10);
        } else {
            if (a % 2 == 0) {
                System.out.println("Total income:");
                System.out.println("$" + ((a / 2) * b * 10 + ((a / 2) * b * 8)));
            } else {
                System.out.println("Total income:");
                System.out.println("$" + ((a / 2) * b * 10 + ((a / 2) + 1 ) * b * 8));
            }
        }





    }
}