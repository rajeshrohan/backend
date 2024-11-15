package desing_patterns.factory;

import desing_patterns.factory.components.Button.Button;
import desing_patterns.factory.components.Button.IOSButton;
import desing_patterns.factory.components.navbar.IOSNavbar;
import desing_patterns.factory.components.navbar.Navbar;

public class IOSUICompFactory implements UIComponentFactory{
    @Override
    public Button getButton() {
        return new IOSButton();
    }

    @Override
    public Navbar getNavbar() {
        return new IOSNavbar();
    }
}
