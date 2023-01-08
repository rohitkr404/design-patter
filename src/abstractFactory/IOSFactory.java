package abstractFactory;

public class IOSFactory implements UIFactory{
    @Override
    public void createButton() {
        System.out.println("creating IOS button");
    }

    @Override
    public void createMenu() {
        System.out.println("creating IOS menu");
    }

    @Override
    public void createDropdown() {
        System.out.println("creating IOS dropdown");
    }
}

