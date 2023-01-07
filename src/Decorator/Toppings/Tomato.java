package Decorator.Toppings;

import Decorator.Pizza;

public class Tomato extends Pizza {
    public Tomato(Pizza pizza){
        this.name = pizza.getDesciption() + " + Tomato";
        this.cost = pizza.getCost() + 30;
    }
    public String getDesciption() {
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
