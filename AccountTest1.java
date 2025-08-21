package AccountTest;

public class AccountTest1 {
   

    public static void main(String[] args) {
        SavingAccount1 sa0001 = new SavingAccount1();
        sa0001.balance = 1000;
        sa0001.name = "Marzz";
        sa0001.interestRate = 0.05;
        sa0001.deposit = 1000;
        sa0001.displayCostumer();
        SavingAccount1 sa0002 = new SavingAccount1();
        sa0002.balance = 2000;
        sa0002.name = "Andre";
        sa0002.interestRate = 0.07;
        sa0002.deposit = 2000;
        sa0002.displayCostumer();
        sa0001.withdraw(500);

        



    }
    
}
