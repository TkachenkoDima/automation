package homework3.TasksFromPresentation;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter daytime and check response:");
        int dayTime = input.nextInt();

        if (dayTime >= 18) {
            System.out.println("Good evening");
        }   else {
            System.out.println("Good day");
        }
    }
}