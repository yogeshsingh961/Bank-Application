import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name, password & balance");

        String name=sc.next();
        String password= sc.next();
        int balance= sc.nextInt();

        SbiAccount yogeshAcc= new SbiAccount(name,password,balance);

        System.out.println("Congratulations! Your Account has been opened in Sbi with Account No "+yogeshAcc.getAccountNo());

        // currBalance
        System.out.println("Initial Balance "+yogeshAcc.getBalance());

        //depositMoney
        System.out.println("Enter amount to deposit");
        int Amount=sc.nextInt();
        System.out.println(yogeshAcc.depositMoney(Amount));

        //withdraw
        System.out.println("Enter amount to withdraw");
        int amount=sc.nextInt();
        System.out.println("Please Enter your password");
        String Password= sc.next();
        System.out.println(yogeshAcc.withdraw(amount,password));

       // rateOfInterest
        System.out.println("Enter the time for interest");
        int time=sc.nextInt();
        System.out.println(yogeshAcc.calculateInterest(time));
        System.out.println(yogeshAcc.getRateOfInterest()); // o/p = 6.6




    }
}