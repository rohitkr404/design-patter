package Decorator.Toppings;

import Decorator.Pizza;

public class Cheese extends Pizza {
    public Cheese(Pizza pizza){
        this.name = pizza.getDesciption() + " + Cheese";
        this.cost = pizza.getCost() + 80;
    }
    public String getDesciption() {
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
