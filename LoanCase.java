package loanapp;

/*
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least two years.
 */
import java.util.Scanner;

public class LoanCase {

    public static void main(String[] args){

        // Initialize known values
        double Required_salary = 30000.00;
        double Required_year = 2.00;

        Scanner scanner = new Scanner(System.in);
        double salary = 0.0;
        System.out.println("Enter your take home salary: ");
        salary = scanner.nextDouble();

        double year = 0.0;
        System.out.println("Enter year of working at current company: ");
        year = scanner.nextDouble();

        // Quote
        if(salary >= Required_salary && year >= Required_year){
            System.out.println("You're qualified for the loan");
        } else{
            System.out.println("Sorry, you're not qualify for the loan");
        }


    }
}
