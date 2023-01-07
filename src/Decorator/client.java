package Decorator;

import Decorator.BasePizzas.BBQChicken;
import Decorator.BasePizzas.Pepperoni;
import Decorator.Toppings.Cheese;
import Decorator.Toppings.Paneer;
import Decorator.Toppings.Tomato;

public class client {
    public static void main(String[] args) {
        Pizza p = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(p.getCost());
        System.out.println(p.getDesciption());
    }
}
