package ATM;

import java.util.Scanner;

public class ATMmachiene {
    float balance;
    float withdraw;
    int pin;

    public void checkpin(int pin){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin: ");
        pin = sc.nextInt();
        if(pin == 1234){
            menu();
        }
        else{
            System.out.println("Incorrect pin");
        }
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. deposit money");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                checkBalance();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                System.out.println("Thank you for using our service");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public void checkBalance(){
        System.out.println("Your balance is: " + balance);
        System.out.println("--------------------====--------------------");
        menu();
    }
    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw: ");
        withdraw = sc.nextFloat();
        if(withdraw > balance){
            System.out.println("Insufficient balance");
            System.out.println("--------------------====--------------------");
        }
        else{
            balance = balance - withdraw;
            System.out.println("Please collect your money");
            System.out.println("Your balance is: " + balance);
            System.out.println("--------------------====--------------------");
        }
        menu();
    }

    public void depositMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit: ");
        float deposit = sc.nextFloat();
        balance = balance + deposit;
        System.out.println("Money deposited successfully");
        System.out.println("Your balance is: " + balance);
        System.out.println("--------------------====--------------------");
        menu();
    }


}

