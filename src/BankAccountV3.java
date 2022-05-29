public class BankAccountV3 {
    private double balance;

    //constructor
    public BankAccountV3(double balance) {
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
        if (amount < 0) {
            return false;
        } else {
            balance += amount;
            System.out.println("deposit " + amount + " new balance: " + balance);
            return true;
        }
    }

    //method to withdraw
    //Make sure your withdraw method throws an exception if appropriate.
    public boolean withdraw(double withdrawAmount) throws Exception {
        if (withdrawAmount < 0) {
            throw new Exception("please enter your withdrawal as a positive amount");
        }
        if (withdrawAmount > balance) {
            throw new Exception("You cannot withdraw more than your balance");
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

    public static void main(String[] args) throws Exception {
        BankAccountV3 myAccount = new BankAccountV3(25.00);
        myAccount.deposit(5.00);
        myAccount.withdraw(10.00);
        myAccount.withdraw(10.00);
        System.out.println(myAccount);
        //note that throwing the exception causes the code to stop and the remaining lines are not run
        myAccount.withdraw(20.00);
        myAccount.deposit(10.00);
        myAccount.withdraw(20.00);
        myAccount.withdraw(-20.00);
        System.out.println(myAccount);

    }


}

//from Data_Structures_and_Problem_Solving_Using_Java__4ed__Weiss.pdf
/* An Account class stores a current balance, and provides getBalance, deposit,
withdraw, and toString methods in addition to at least one constructor.
Write and test an Account class. Make sure your withdraw method throws an exception if appropriate.
*/