package Decorator.BasePizzas;

import Decorator.Pizza;

public class BBQChicken extends Pizza {

    public BBQChicken(){
        this.name = "BBQChicken";
        this.cost = 200;
    }
    public String getDesciption() {
        return this.name;
    }

    public int getCost(){
        return this.cost;
    }
}
