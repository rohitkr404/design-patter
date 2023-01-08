package observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    public static Flipkart instance = null;
    public List<OrderPlacedSubscriber> subscribers = new ArrayList<OrderPlacedSubscriber>();
    private Flipkart(){

    }

    public static Flipkart getInstance(){
        if(instance == null){
            instance = new Flipkart();
        }
        return instance;
    }

    void registerSubscriber(OrderPlacedSubscriber subscriber){
        subscribers.add(subscriber);
    }

    void unRegisterSubscriber(OrderPlacedSubscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void onOrderPlaced(){
//        an.notify();
//        ig.generateInvoice()
//        en.send()

        for (OrderPlacedSubscriber subscriber : subscribers) {
            subscriber.announceOrderPlaced();
        }
    }
}
