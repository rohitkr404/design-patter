package observer;

public class EmailSender implements OrderPlacedSubscriber, OrderCancelledSubscriber{

    public EmailSender(){
        Flipkart flipkart= Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {

    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("order placed Email informed");
        return new ReturnData();
    }
}
