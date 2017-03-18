/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author neodze
 */
public class Menu  {
    
    Scanner keyboard = new Scanner(System.in);
    bank Bank  = new bank();
    boolean exit;
    
    public static void main(String[] args) {
           Menu menu = new Menu();
           menu.runMenu();
    }
    
    public void runMenu(){
        printHeader();
        while(!exit){
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private void printHeader() {
            System.out.println("--------------------------------");
            System.out.println("|       welcome to rezikos     |");
            System.out.println("|          Awsome Bank App     |");
            System.out.println("--------------------------------");
    }

    private void printMenu() {
             System.out.println("Pleace Make a selection");
             System.out.println("1) Create a new Account");
             System.out.println("2) Make a depostit");
             System.out.println("3) Make a withdrawl");
             System.out.println("4)List account ballance");
             System.out.println("0) Exit");
    }

    private int getInput() {
      int choice = -1;
    do{
        System.out.print("Enter Your Choice :");
            try {
               choice = Integer.parseInt(keyboard.nextLine());
           }
           catch(NumberFormatException e){
               System.out.println("Pleace insert an integer");
           }
            if(choice < 0 || choice > 4){
                System.out.println("choose option from 0 th 1 pleace");
            }
            
        }while(choice < 0 || choice > 4);  
         return choice;
    }

    private void performAction(int choice) {
        switch(choice){
            case 0:
                System.out.println("Thank you for choosing our App");
                System.exit(0);
            break;
            case 1:
                createAccount();
            break;
               
            case 2:
                makeDeposit();
            break;
                    
            case 3:
                makeWithdrow();
            break;
            
            case 4: 
                listBalances();   
            break;
                default:
                System.out.println("Unknown error");
      }
    }

    private void createAccount() {
          
        String firstName = "", lastName = "", ssn = "", AccountType = "";
        double initailDeposit = 0;
        boolean valid = false;
        while(!valid){
           System.out.print("Pleace enter an Account Type (cheking/savings):");
            AccountType = keyboard.nextLine();
            if(AccountType.equalsIgnoreCase("checking") ||  AccountType.equalsIgnoreCase("savings")){
               valid = true;
            }
          }
            System.out.print("Pleace Enter Your First Name :");
                firstName = keyboard.nextLine();
            System.out.print("Pleace enter Your Last Name :");
                lastName = keyboard.nextLine();
            System.out.print("Pleace enter Your Security Number :");
                ssn = keyboard.nextLine();
                
            valid = false;
            while(!valid){
               System.out.print("Pleace Enter Your Initial Number :");
               try{
                   initailDeposit = Double.parseDouble(keyboard.nextLine());
               }
               catch(NumberFormatException e){
                   System.out.println("Deposit Must Be a Number");
               }
             
               if(AccountType.equalsIgnoreCase("checking")){
                   if(initailDeposit < 100){
                       System.out.println("Checking accounts require a minimum of $100 dollars to open");
                   }else{
                       valid = true;
                   }
               }
               else if(AccountType.equalsIgnoreCase("savings")){
                   if(initailDeposit <100){
                       System.out.println("Savings accounts require a minimum of $50 dollars to open");
                   }else{
                       valid = true;
                   }
               }
            }
                   account account; 
                   if(AccountType.equalsIgnoreCase("checking")){
                        account = new checking(initailDeposit);
                    }else{
                        account = new savings(initailDeposit);
                    }
                   costumer costumer = new costumer(firstName,lastName, ssn, account);
                   bank.addCostumer(costumer);
     }

    private void makeDeposit(){
        int account  = selectaccount();
        if(account >= 0){ 
        bank.getCostumer(account);
        System.out.println("How much would you like to deposit?:  ");
        double amount = 0;
        try {
               amount = Double.parseDouble(amount);
        } catch (NumberFormatException e) {
            amount = 0;
        }
        bank.getCostumer(account).deposit(amount);
        }
    }
    
    private void makeWithdrow() {
             int account  = selectaccount();
        if(account >= 0){ 
        bank.getCostumer(account);
        System.out.println("How much would you like to withdrow?:  ");
        double amount = 0;
        try {
               amount = Double.parseDouble(amount);
        } catch (NumberFormatException e) {
            amount = 0;
        }
        bank.getCostumer(account).withdraw(amount);
        }
    }

    private void listBalances() {
        int account  = selectaccount();
        if(account >= 0){
            System.out.println(bank.getCostumer(account).getAccount());
        }else {
            System.out.println("Invalid account selected.");
        }
    }

    private int selectaccount() {
        ArrayList<costumer> costumers = bank.getcostumers();
        if(costumers.size() <= 0){
            System.out.println("No Costumers At Your Bank");
            return -1;
        }
        System.out.println("Select an Account:");
        for(int i = 0 ; i< costumers.size(); i++){
            System.out.println(i+1) + ")" + costumers.get(i).basicInfo();
        }   
        int account = 0; 
            System.out.print("Pleace Enter Your selection:");
        try{
            account = Double.parseDouble(keyboard.nextLine())-1 ;
        }
            catch(NumberFormatException e){
            account = -1;
        } 
        if(account < 0 ||   account > costumers.size()){
            System.out.println("Invalid Account Selected");
            account = -1;
        }
        return account;
    }
}