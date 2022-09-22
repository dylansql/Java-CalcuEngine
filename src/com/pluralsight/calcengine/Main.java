package com.pluralsight.calcengine;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int result = 0;
        System.out.println("Welcome to a Calculator");
        System.out.println("Enter a number: ");
        int value1 = scn.nextInt();
        System.out.println("Enter a second number: ");
        int value2 = scn.nextInt();

        System.out.println("Please enter Operation... ");

        char logic = scn.next().charAt(0);
        System.out.println("Loading....");
        System.out.println("Got it!: ");

        switch(logic) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                result = value1 % value2;
                break;
            default:
                System.out.println("invalid" + " operation... You selected: " + logic);
                break;
        }
        System.out.println(result);
    }
}