/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author neodze
 */
public class costumer {

    private final String firstName;
    private final String ssn;
    private final String lastName;
    private final account account;

    costumer(String firstName, String lastName, String ssn, account account) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.ssn = ssn;
            this.account = account;
    }
    
    @Override
    public String toString(){
        return "Costumer information\n" + "\n" +
                "FirstName :" + firstName + "\n" +
                "LastName :" + lastName +   "\n" +
                "ssn :" + ssn +  "\n" +
                account;                
    }
        
    @Override
    public String basicInfo(){
        return "Costumer information\n" + "\n" +
                " FirstName :" + firstName + "\n" +
                " LastName :" + lastName +   "\n" +
                " ssn :" + ssn +  "\n" +
                " Account Number :" + account.getAccountNumber();                
    }

    void add(costumer costumer) {

    }
}
