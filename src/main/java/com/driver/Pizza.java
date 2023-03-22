package com.driver;

public class Pizza {

    public String bill;

    public int basePrice;

    public int cheesePrice;

    public int toppingsPrice;

    public int paperBagPrice;

    public int totalPrice;

    public boolean isCheeseAdded;
    public boolean isToppingsAdded;
    public boolean isPaperBagAdded;
    public boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        // your code goes here
        if(isVeg){
            basePrice=300;
            toppingsPrice=70;
        }
        else{
            basePrice=400;
            toppingsPrice=120;
        }
        paperBagPrice=20;
        cheesePrice=80;

        totalPrice=basePrice;
        bill = "Base Price Of The Pizza: "+basePrice+"\n";
        isCheeseAdded=false;
        isToppingsAdded=false;
        isPaperBagAdded=false;
        isBillGenerated=false;
    }

    public int getPrice(){
        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheeseAdded){
            this.totalPrice+=cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingsAdded){
            this.totalPrice+=toppingsPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            this.totalPrice+=paperBagPrice;
            isPaperBagAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBillGenerated){

            if(isCheeseAdded){
                bill+="Extra Cheese Added: "+cheesePrice+"\n";
            }
            if(isToppingsAdded){
                bill+="Extra Toppings Added: "+toppingsPrice+"\n";
            }
            if(isPaperBagAdded){
                bill+="Paperbag Added: "+paperBagPrice+"\n";
            }
            bill+="Total Price: "+totalPrice+"\n";
            isBillGenerated=true;
        }
        return bill;
    }
}
