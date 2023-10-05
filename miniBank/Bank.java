package miniBank;

import java.util.Scanner;

import Methods.Loan_Account;
import Methods.Saving_Account;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Select Your Bank Type:- \n -For Saving Account Press 1\n -For Loan Account Press 2\n -For Exit Press 0");
        int type = sc.nextInt();
        Saving_Account saving = new Saving_Account();
        Loan_Account Loan = new Loan_Account();
        if (type == 1) {
            saving.SavingDeposit();
        } else if (type == 2) {
            Loan.Loan();
        } else if (type == 0) {
            System.out.println("THANK YOU, HAVE A GOOD DAY!!");
        } else {
            System.out.println("Invalid, Entry!!");
        }

    }
}
