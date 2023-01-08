package abstractFactory;

public class AndroidFactory implements UIFactory{
    @Override
    public void createButton() {
        System.out.println("creating Android button");
    }

    @Override
    public void createMenu() {
        System.out.println("creating Android menu");
    }

    @Override
    public void createDropdown() {
        System.out.println("creating Android dropdown");
    }
}
