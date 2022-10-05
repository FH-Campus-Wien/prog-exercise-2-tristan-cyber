package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

        int counter = 1;
        double largest;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number "+ counter++ + ": ");
        double number = largest = scanner.nextDouble();

        if (number <= 0) {
            System.out.println("No number entered.");
        } else {

            while (number > 0) {
                System.out.print("Number " + counter + ": ");
                number = scanner.nextDouble();

                if (largest < number) {
                    largest = number;
                }

                counter++;

            }

            System.out.printf("The largest number is %.2f" + System.lineSeparator(), largest);
        }
        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);

        final int ROWS = scanner.nextInt();
        System.out.print("n: ");
        int runningvariable = 1;

        if (ROWS >= 0) {
            for (int row = 0; row < ROWS; row++) {
                for (int col = ROWS; col >= ROWS - row; col--) {
                    System.out.print(runningvariable + " ");
                    runningvariable++;
                }
                System.out.println();
            }
        } else System.out.println("Invalid number!");
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        int ROWS = 6;

        for (int row = 1; row <= ROWS; row++){
            for (int col = ROWS; col > row; col--) {
                System.out.print(" ");
            }
            for (int col = 0; col < row*2-1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }



    // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // zum char einlesen char c = scan.next().charAt(0);
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int mark = 0;
        int sum = 0;
        int negCount = 0;

        do { if (mark > 5 || mark < 0) {
            System.out.println("Invalid mark!");
        }
            System.out.print("Mark " + counter + ": ");
            mark = scanner.nextInt();
            if (mark <=5) {
                counter++;
                sum = sum + mark;
            }
            if (mark == 5) {
                negCount ++;
            }

        } while (mark != 0);

        float average = (float)sum / (counter - 2) ;

        if (sum <= 0) {
            System.out.println("Average: 0,00");
        } else {
            System.out.printf("Average: %.2f" + System.lineSeparator(), average);
        }
        System.out.println("Negative marks: "+ negCount);
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}