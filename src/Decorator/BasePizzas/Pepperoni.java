package Decorator.BasePizzas;

import Decorator.Pizza;

public class Pepperoni extends Pizza {

    public Pepperoni(){
        this.name = "Pepperoni";
        this.cost = 180;
    }
    public String getDesciption() {
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
