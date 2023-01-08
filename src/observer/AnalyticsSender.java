package observer;

public class AnalyticsSender implements OrderCancelledSubscriber, OrderPlacedSubscriber{

    public AnalyticsSender(){
        Flipkart flipkart= Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {

    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("order placed Analytics informed");
        return new ReturnData();
    }
}
