//Trying to find from the url
//.com --> commercial website
//.org -> organisation website
//.in -> India Website

package Java_Learn.Conditions.PS;

import java.util.Scanner;

public class PS_Q6 {
    public static void main(String[] args) {

        //Creating Scanner Class
        Scanner sc = new Scanner(System.in);

        //Taking Input
        System.out.print("Enter domain name: ");
        String domain = sc.next();

        //Condition and printing
        switch (domain) {
            case ".com":
                System.out.print("Commercial Website...");
                break;
            case ".org":
                System.out.println("Organisation Website...");
                break;
            case ".in":
                System.out.println("Indian Website...");
                break;
            default:
                System.out.println("No recognized domain");
        }
    }
}