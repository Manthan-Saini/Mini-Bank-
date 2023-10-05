package Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Saving_Account {
    public static void SavingDeposit() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> amt = new ArrayList<Double>();// ListArray to add deposit amount
        ArrayList<Double> takenAmt = new ArrayList<Double>();// ListArray to add withdrawl amount

        // selection of the event to add, withdrwal and enquiry amount
        System.out
                .println(
                        "\nWant To Deposit Money Press 1 || Want To Withdraw Press 2 || For Balance Enquiry Press 3 || For Exit Press 0");
        int num = sc.nextInt();// user opption taken

        // Want to Deposite Money Press 1 code
        if (num == 1) {
            System.out.print("\nEnter The Amount: ");
            double deAmt1 = sc.nextInt();// Taken the amount from user
            amt.add(deAmt1);// amount has been added to amount list Array
            System.out.println("Rs." + deAmt1 + " is Deposited.");// Amount deposited

            // more oppostion after deposting the amount
            System.out
                    .println(
                            "\nWant To Deposit More Money Press 1 || Want To Withdraw Press 2 || For Balance Enquiry Press 3 || For Exit Press 0");
            int num1 = sc.nextInt();
            if (num1 == 1) {
                System.out.print("\nEnter The Amount: ");
                double deAmt2 = sc.nextInt();// Taken the amount from user
                amt.add(deAmt2);// amount has been added to amount list Array
                System.out.println("Rs." + deAmt2 + " is Deposited.");// Amount deposited

                System.out
                        .println(
                                "\nWant To Withdraw Press 1 || For Balance Enquiry Press 2 || For Exit Press 0");
                int num2 = sc.nextInt();
                if (num2 == 1) {
                    System.out.println("\nEnter The Amount: ");
                    double withdrawl = sc.nextDouble();
                    double sum = 0;// sum = is for sum all the elements(amount) in arraylist amount
                    double taken1 = 0;// taken1 = is for summ all the elemets(amount) in array list takenAmt
                    double taAmt = 0;// taAmt = contain sum-taken1 = enquiry amount
                    for (double e : amt) {// summing the amount in arrayList amount
                        sum += e;
                    }
                    for (double e : takenAmt) {// suming the amount in array list takenAmt
                        taken1 += e;
                    }
                    if (sum <= taken1) {
                        takenAmt.add(withdrawl);// amount added to takenAmt Arraylist
                        System.out.println("Rs." + takenAmt + " is Withdrawl..");// Amount withdrawl message
                    } else {
                        System.out.println("You Dont have Enough amount!!");
                    }

                    System.out
                            .println(
                                    "\nFor Balance Enquiry Press 1 || For Exit Press 0");
                    int num3 = sc.nextInt();
                    if (num3 == 1) {
                        double sum2 = 0;// sum = is for sum all the elements(amount) in arraylist amount
                        double taken2 = 0;// taken1 = is for summ all the elemets(amount) in array list takenAmt
                        double taAmt1 = 0;// taAmt = contain sum-taken1 = enquiry amount
                        for (double e : amt) {// summing the amount in arrayList amount
                            sum2 += e;
                        }
                        for (double e : takenAmt) {// suming the amount in array list takenAmt
                            taken2 += e;
                        }

                        taAmt1 = sum - taken2;// final amount = enquiry amount
                        // Print the sum
                        System.out.println("\nTotal Amount :" + taAmt1);// enquiry Amount
                        System.out.println("\nTHANK YOU HAVE A GOOD DAY!!");// Greeting message
                    } else if (num3 == 0) {
                        System.out.println("THANK YOU, HAVE A GOOD DAY!!");
                    } else {
                        System.out.println("Envalid Opption!!");
                    }
                } else if (num2 == 2) {
                    double sum = 0;// sum = is for sum all the elements(amount) in arraylist amount
                    double taken1 = 0;// taken1 = is for summ all the elemets(amount) in array list takenAmt
                    double taAmt = 0;// taAmt = contain sum-taken1 = enquiry amount
                    for (double e : amt) {// summing the amount in arrayList amount
                        sum += e;
                    }
                    for (double e : takenAmt) {// suming the amount in array list takenAmt
                        taken1 += e;
                    }
                    taAmt = sum - taken1;// final amount = enquiry amount
                    // Print the sum
                    System.out.println("\nTotal Amount :" + taAmt);// enquiry Amount
                    System.out.println("\nTHANK YOU HAVE A GOOD DAY!!");// Greeting message
                } else if (num1 == 0) {
                    System.out.println("THANK YOU, HAVE A GOOD DAY!!");
                } else {
                    System.out.println("Envalid Opption!!");
                }

            } else if (num1 == 2) {
                System.out.println("\nEnter The Amount: ");
                double withdrawl = sc.nextDouble();
                double sum3 = 0;// sum = is for sum all the elements(amount) in arraylist amount
                double taken3 = 0;// taken1 = is for summ all the elemets(amount) in array list takenAmt
                double taAmt3 = 0;// taAmt = contain sum-taken1 = enquiry amount
                for (double e : amt) {// summing the amount in arrayList amount
                    sum3 += e;
                }
                for (double e : takenAmt) {// suming the amount in array list takenAmt
                    taken3 += e;
                }
                if (sum3 <= taken3) {
                    takenAmt.add(withdrawl);// amount added to takenAmt Arraylist
                    System.out.println("Rs." + takenAmt + " is Withdrawl..");// Amount withdrawl message
                } else {
                    System.out.println("You Dont have Enough amount!!");
                }

                System.out
                        .println(
                                "\nFor Balance Enquiry Press 1 || For Exit Press 0");
                int num3 = sc.nextInt();
                if (num3 == 1) {
                    double sum = 0;// sum = is for sum all the elements(amount) in arraylist amount
                    double taken1 = 0;// taken1 = is for summ all the elemets(amount) in array list takenAmt
                    double taAmt = 0;// taAmt = contain sum-taken1 = enquiry amount
                    for (double e : amt) {// summing the amount in arrayList amount
                        sum += e;
                    }
                    for (double e : takenAmt) {// suming the amount in array list takenAmt
                        taken1 += e;
                    }
                    taAmt = sum - taken1;// final amount = enquiry amount
                    // Print the sum
                    System.out.println("\nTotal Amount :" + taAmt);// enquiry Amount
                    System.out.println("\nTHANK YOU HAVE A GOOD DAY!!");// Greeting message
                } else if (num1 == 3) {
                    double sum = 0;// sum = is for sum all the elements(amount) in arraylist amount
                    double taken1 = 0;// taken1 = is for summ all the elemets(amount) in array list takenAmt
                    double taAmt = 0;// taAmt = contain sum-taken1 = enquiry amount
                    for (double e : amt) {// summing the amount in arrayList amount
                        sum += e;
                    }
                    for (double e : takenAmt) {// suming the amount in array list takenAmt
                        taken1 += e;
                    }
                    taAmt = sum - taken1;// final amount = enquiry amount
                    // Print the sum
                    System.out.println("\nTotal Amount :" + taAmt);// enquiry Amount
                    System.out.println("\nTHANK YOU HAVE A GOOD DAY!!");// Greeting message
                } else if (num1 == 0) {
                    System.out.println("\nTHANK YOU HAVE A GOOD DAY!!");// Greeting message
                } else {
                    System.out.println("Envalid Opption!!");
                }
            }
        } else if (num == 2) {
            System.out.println("There is NO Amount in the Bank First Deposite The Amount!!");
            System.out.println("Thank You!!");
        } else if (num == 3) {
            double sum = 0;// sum = is for sum all the elements(amount) in arraylist amount
            double taken1 = 0;// taken1 = is for summ all the elemets(amount) in array list takenAmt
            double taAmt = 0;// taAmt = contain sum-taken1 = enquiry amount
            for (double e : amt) {// summing the amount in arrayList amount
                sum += e;
            }
            for (double e : takenAmt) {// suming the amount in array list takenAmt
                taken1 += e;
            }
            taAmt = sum - taken1;// final amount = enquiry amount
            // Print the sum
            System.out.println("\nTotal Amount :" + taAmt);// enquiry Amount
            System.out.println("\nTHANK YOU HAVE A GOOD DAY!!");// Greeting message
        } else if (num == 0) {
            System.out.println("\nTHANK YOU HAVE A GOOD DAY!!");// Greeting message
        } else {
            System.out.println("Envalid Opption!!");
        }
    }
}
