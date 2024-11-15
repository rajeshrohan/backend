package desing_patterns.factory;

import desing_patterns.factory.components.Button.Button;
import desing_patterns.factory.components.navbar.Navbar;

public class Windows extends Platform{
    @Override
    void check() {
        System.out.println("I am windows");
    }

    @Override
    void version() {
        System.out.println("Windows 11");
    }
//    @Override
//    Button getButton(){
//        return null;
//    }
//
//    @Override
//    Navbar getNavbar() {
//        return null;
//    }


    @Override
    UIComponentFactory getUICompFactory() {
        return null;
    }
}
