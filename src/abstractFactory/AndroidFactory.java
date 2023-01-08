package abstractFactory;

import abstractFactory.components.buttons.AndroidButton;
import abstractFactory.components.dropdowns.AndroidDropdown;
import abstractFactory.components.menus.AndroidMenu;

public class AndroidFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        System.out.println("creating Android button");
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        System.out.println("creating Android menu");
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        System.out.println("creating Android dropdown");
        return new AndroidDropdown();
    }
}
