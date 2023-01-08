package abstractFactory;

import abstractFactory.components.buttons.Button;
import abstractFactory.components.dropdowns.Dropdown;
import abstractFactory.components.menus.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();


}
