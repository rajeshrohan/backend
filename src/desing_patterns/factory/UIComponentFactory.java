package desing_patterns.factory;

import desing_patterns.factory.components.Button.Button;
import desing_patterns.factory.components.navbar.Navbar;

public interface UIComponentFactory {
    Button getButton();
    Navbar getNavbar();
}
