package observer;

public class InvoiceGenerator implements OrderCancelledSubscriber, OrderPlacedSubscriber {

    public InvoiceGenerator(){
        Flipkart flipkart= Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {

    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("order placed Invoice informed");
        return new ReturnData();
    }
}
