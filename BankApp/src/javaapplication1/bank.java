package javaapplication1;

import java.util.ArrayList;

class bank {

    
 ArrayList<costumer> costumers = new ArrayList<costumer>();
         
    static void addCostumer(costumer costumers) {
        costumers.add(costumers);
    }
    
    costumer getCostumer(int account) {
            return costumers.get(account);
    }
    
    ArrayList<costumer> getcostumers(){
        return costumers;
    }
}
