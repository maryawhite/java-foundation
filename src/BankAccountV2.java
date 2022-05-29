public class BankAccountV2 {
    private double balance;

    //constructor
    public BankAccountV2(double balance) {
        this.balance = balance;
    }

    //getter and setter
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //method to deposit
    public boolean deposit(double amount) {
        if(amount < 0) {
            return false;
        } else {
            balance += amount;
            System.out.println("deposit " + amount + " new balance: " + balance);
            return true;
        }
    }

    //method to withdraw
    //Make sure your withdraw method throws an exception if appropriate.
    public boolean withdraw(double withdrawAmount) {
        if(withdrawAmount < 0) {
            System.out.println("please enter your withdrawal as a positive amount");
            return false;
        } if(withdrawAmount > balance) {
            System.out.println("You cannot withdraw more than your balance");
            return false;
        }

            balance -= withdrawAmount;
            System.out.println("withdraw " + withdrawAmount + " new balance: " + balance);
            return true;
    }

    @Override
    public String toString() {
        return "BankAccountV2 " +
                "balance = " + balance;
    }

    public static void main(String[] args) {
        BankAccountV2 myAccount = new BankAccountV2(25.00);
        myAccount.deposit(5.00);
        try{
            myAccount.withdraw(10.00);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            myAccount.withdraw(10.00);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            myAccount.withdraw(20.00);
        } catch (Exception e) {
            e.printStackTrace();
        }

        myAccount.deposit(10.00);

        try{
            myAccount.withdraw(20.00);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            myAccount.withdraw(-20.00);
        } catch(Exception e) {
            e.printStackTrace();
        }

        System.out.println(myAccount);

    }


}

//from Data_Structures_and_Problem_Solving_Using_Java__4ed__Weiss.pdf
/* An Account class stores a current balance, and provides getBalance, deposit,
withdraw, and toString methods in addition to at least one constructor.
Write and test an Account class. Make sure your withdraw method throws an exception if appropriate.
*/