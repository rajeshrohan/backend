package desing_patterns.factory;

import desing_patterns.factory.components.Button.Button;
import desing_patterns.factory.components.Button.IOSButton;
import desing_patterns.factory.components.navbar.IOSNavbar;
import desing_patterns.factory.components.navbar.Navbar;

public class IOS extends Platform {
    @Override
    void check(){
        System.out.println("I am IOS");
    }

    @Override
    void version() {
        System.out.println("IOS 15");
    }

//    @Override
//    Button getButton() {
//        return new IOSButton();
//    }
//
//    @Override
//    Navbar getNavbar() {
//        return new IOSNavbar();
//    }

    @Override
    UIComponentFactory getUICompFactory() {
        return new IOSUICompFactory();
    }
}
