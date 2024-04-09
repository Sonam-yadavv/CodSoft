import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {
        int balance=10000;
        int withdraw,deposits;
        Scanner sc=new Scanner(System.in);

        System.out.println();
        System.out.println("Automated Teller Machine");
        while(true)
        {
            System.out.println();

            System.out.println("Enter 1 for withdrwal");
            System.out.println("Enter 2 for deposit");
            System.out.println("Enter 3 for Check balance");
            System.out.println("Enter 4 for EXIT");

            System.out.println();
            System.out.print("Choose the operation you want to perform :");
            int option=sc.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.println("Enter the amount to be withdrawn :");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw)
                    {
                    balance-=withdraw;
                    System.out.println("Please collect you money");
                    }
                    else 
                    {
                    System.out.println("Insufficient Balance");
                    }
                    break;

                    case 2:
                    System.out.println("Enter the amount to be deposited");
                    deposits=sc.nextInt();
                    balance+=deposits;
                    System.out.println("Your money has been succefully deposited");
                    break;

                    case 3:
                    System.out.println("Your balace is "+balance);
                    break;
                    
                    case 4:
                    System.exit(0);
                    break;

                default:
                System.out.println("Incorrect operation");
                    break;
            }
        }
    }
}
