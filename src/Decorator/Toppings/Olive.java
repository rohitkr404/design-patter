package Decorator.Toppings;

import Decorator.Pizza;

public class Olive extends Pizza {
    public Olive(Pizza pizza){
        this.name = pizza.getDesciption() + " + Olive";
        this.cost = pizza.getCost() + 20;
    }
    public String getDesciption() {
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
