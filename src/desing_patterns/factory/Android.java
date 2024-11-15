package desing_patterns.factory;

import desing_patterns.factory.components.Button.AndroidButton;
import desing_patterns.factory.components.Button.Button;
import desing_patterns.factory.components.navbar.AndroidNavbar;
import desing_patterns.factory.components.navbar.Navbar;

public class Android extends Platform{
    @Override
    void check(){
        System.out.println("I am Android");
    }

    @Override
    void version() {
        System.out.println("Android 14");
    }

//    @Override
//    Button getButton() {
//        return new AndroidButton();
//    }
//
//    @Override
//    Navbar getNavbar() {
//        return new AndroidNavbar();
//    }


    @Override
    UIComponentFactory getUICompFactory() {
        return new AndroidUICompFactory();
    }
}
