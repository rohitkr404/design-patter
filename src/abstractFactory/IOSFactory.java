package abstractFactory;

import abstractFactory.components.buttons.IOSButton;
import abstractFactory.components.dropdowns.IOSDropdown;
import abstractFactory.components.menus.IOSMenu;

public class IOSFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        System.out.println("creating IOS button");
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        System.out.println("creating IOS menu");
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        System.out.println("creating IOS dropdown");
        return new IOSDropdown();
    }
}

