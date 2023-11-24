package main.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        method1();
       method2();
//        method3();
//        method4();
    }
    public static void method1() {

        Scanner scanner = new Scanner(System.in);
        int scannerValue = scanner.nextInt();
        int[] firstArray = new int [scannerValue];
        for(int i = 0; i < firstArray.length; i++) {
            firstArray[i] = 1;
        }
        for(int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
    }
    public static void method2() {

        for(int a=9; a>=0; a--) {
            for(int b=9; b>=0; b--) {
                System.out.println( a + " * " + b + " = " + a * b );
            }
        }
    }
    public static void method3() {

        int var = 0;
        while (var < 5) {
            System.out.println("Hello");
            var++;
        }

        Scanner scanner = new Scanner(System.in);
        int result;
        do {
            System.out.println("Type " + 10);
            result = scanner.nextInt();
        } while (result == 10);

    }
    public static void method4() {

        int intValue = 7;
        int[][] array = new int[2][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = intValue;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
