package Decorator.BasePizzas;

import Decorator.Pizza;

public class Farmhouse extends Pizza {
    public Farmhouse(){
        this.name = "Farmhouse";
        this.cost = 150;
    }
    public String getDesciption() {
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
