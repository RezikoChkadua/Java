package javaapplication1;
public class checking extends account{
    private static String accountType = "Checking";
    
    checking(double initialDeposit){
        super();
        this.setBalance(initialDeposit);
        this.checkInterest(0);
    }

    @Override
    public String toString(){
       return "Account Type :" + accountType + "Account\n"+
              "Account Number :" + this.getAccountNumber() + "\n"+
              "Ballance " + this.getBalance() + "\n" +
              "Interest Rate: "+ this.getInterest() + "%\n";
    }
}


