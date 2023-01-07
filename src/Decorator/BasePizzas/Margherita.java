package Decorator.BasePizzas;

import Decorator.Pizza;

public class Margherita extends Pizza {
    public Margherita(){
        this.name = "Margherita";
        this.cost = 200;
    }
    public String getDesciption() {
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
