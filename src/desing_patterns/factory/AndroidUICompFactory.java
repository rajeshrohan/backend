package desing_patterns.factory;

import desing_patterns.factory.components.Button.AndroidButton;
import desing_patterns.factory.components.Button.Button;
import desing_patterns.factory.components.navbar.AndroidNavbar;
import desing_patterns.factory.components.navbar.Navbar;

public class AndroidUICompFactory implements UIComponentFactory {
    @Override
    public Button getButton() {
        return new AndroidButton();
    }

    @Override
    public Navbar getNavbar() {
        return new AndroidNavbar();
    }
}

