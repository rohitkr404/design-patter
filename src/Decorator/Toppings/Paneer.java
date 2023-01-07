package Decorator.Toppings;

import Decorator.Pizza;

public class Paneer extends Pizza {
    public Paneer(Pizza pizza){
        this.name = pizza.getDesciption() + " + Paneer";
        this.cost = pizza.getCost() + 60;
    }
    public String getDesciption() {
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
