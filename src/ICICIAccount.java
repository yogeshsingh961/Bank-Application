import java.util.UUID;

public class ICICIAccount implements BankInterface {
    private int balance;
    private double  rateOfInterest;
    private String password;
    private int mobileNo;
    private String name;
    private String accountNo;

    public ICICIAccount(int balance, String password, int mobileNo, String name) {
        this.balance = balance;
        this.password = password;
        this.mobileNo = mobileNo;
        this.name = name;
        this.rateOfInterest=7.5;
        this.accountNo= String.valueOf(UUID.randomUUID());

    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }

    @Override
    public String withdraw(int amount, String password) {
       return "";
    }

    @Override
    public String depositMoney(int amount) {
        return null;
    }
}
