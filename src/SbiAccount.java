import java.util.UUID;

public class SbiAccount implements BankInterface {
    private String accountNo;
    private String name;
    private String password;
    private int balance;
    private double rateOfInterest;

    public SbiAccount(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.rateOfInterest=6.6;
        this.accountNo= String.valueOf(UUID.randomUUID());
    }

  // getters & setters for these private attributes( alt+insert)


    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {// we don't have its getter bcoz its method is already present in override
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    // implementing the method of interface by overriding it  (click on error on implement)
    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public double calculateInterest(int time) {
        return (this.balance*rateOfInterest*time)/100.0; // also can write (balance*rateOfInterest*time)/100.0
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {

        if(enteredPassword.equals(this.password)){
            if(amount>balance){
                return "Insufficeint Balance";
            }else{
                this.balance-=amount;
                return amount+" has been debited"+" Your Available Balance is-> "+this.balance;
            }
        }else return "Please write the correct password";
    }

    @Override
    public String depositMoney(int amount) {
        this.balance+=amount;
        return amount+" has been credited"+" & Your Current Balnace is "+this.balance; //(this.balance=balance=getBalance)
    }
}
