package abstractFactory.components.buttons;

public class IOSButton implements Button{
    @Override
    public void changeSize(int size) {
        System.out.println("IOS button size changed to "+ size);
    }
}
