package abstractFactory.components.buttons;

public class AndroidButton implements Button{
    @Override
    public void changeSize(int size) {
        System.out.println("Android button size changed to " + size);
    }
}
