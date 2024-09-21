package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        System.out.println("Enter power");
        int power = scanner.nextInt();
        System.out.printf("%d to the power of %d is %.3f \n", num, power, elevationToPower(num, power));
        scanner.close();
    }
    static double elevationToPower(int num, int power){
        if(power == 0) {
            return 1;
        }
        if (power < 0) {
            return 1.0 / (num * elevationToPower(num, -power-1));
        }
        if (power % 2 == 0) {
            double halfPower = elevationToPower(num, power / 2);
            return halfPower * halfPower;
        }
        else {
            return num * elevationToPower(num, power - 1);
        }
    }
}