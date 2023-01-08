package abstractFactory;

import abstractFactory.components.buttons.Button;
import abstractFactory.components.menus.Menu;

public class client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        button.changeSize(10);

        Menu menu = uiFactory.createMenu();
    }
}
