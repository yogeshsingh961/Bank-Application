public interface BankInterface {
     int getBalance();
     double calculateInterest(int time);
     String withdraw(int amount, String password);
     String depositMoney(int amount);


}
