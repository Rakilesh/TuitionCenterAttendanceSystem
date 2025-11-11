package ATM;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            atm atm = new atm(1000.0); // starting balance ₹1000

//            int choice;
//            do {
//                System.out.println("\n=== ATM MACHINE ===");
//                System.out.println("1. Check Balance");
//                System.out.println("2. Deposit Money");
//                System.out.println("3. Withdraw Money");
//                System.out.println("4. Exit");
//                System.out.print("Enter your choice: ");
//                choice = sc.nextInt();
//
//                switch (choice) {
//                    case 1:
//                        atm.checkBalance();
//                        break;
//                    case 2:
//                        System.out.print("Enter deposit amount: ");
//                        double depositAmount = sc.nextDouble();
//                        atm.deposit(depositAmount);
//                        break;
//                    case 3:
//                        System.out.print("Enter withdraw amount: ");
//                        double withdrawAmount = sc.nextDouble();
//                        atm.withdraw(withdrawAmount);
//                        break;
//                    case 4:
//                        System.out.println("Thank you for using the ATM!");
//                        break;
////                    default:
////                        System.out.println("Invalid choice! Please try again.");
//                }
//            } while (choice != 4);
//        }
            Scanner input = new Scanner(System.in);
            atm Atm = new atm();
            int choice;boolean running = true;

            while(running)
            {
                System.out.println("enter the choices ");
                System.out.println("\n=== ATM MACHINE ===");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                switch (choice)
                {

                    case 1:
                    Atm .checkbalances();
                    break;
                    case 2:
                        System.out.println("enter the amount");
                        int c = input.nextInt();
                        Atm.addmoney(c);
                        break;
                    case 3:
                        System.out.println("withdraw money");
                        int C = input.nextInt() ;
                        Atm.withdraw(C);
                        break;
                    case 4 :
                        running = false; // stop loop
                        break;
                    default:
                        System.out.println("enter the correct  option");
                        break;
                }


            }


        }
    }


