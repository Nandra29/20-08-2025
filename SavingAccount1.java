package AccountTest;

public class SavingAccount1 {
    public double balance;
    public String name;
    public double interestRate = 0.01;
    public int deposit;

    public void deposit(int x) {
        balance += x;
    }
    public double calculateInterest() {
        return balance * interestRate;
    }

    public void withdraw(int x) {
        if (x <= balance) {
            balance -= x;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void displayCostumer() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);

    }

   
}

