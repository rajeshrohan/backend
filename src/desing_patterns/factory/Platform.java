package desing_patterns.factory;

import desing_patterns.factory.components.Button.Button;
import desing_patterns.factory.components.navbar.Navbar;

public abstract class Platform {

    abstract void check();
    abstract void version();
//    abstract Button getButton();
//    abstract Navbar getNavbar();

    abstract UIComponentFactory getUICompFactory();

}

/*
Scenario 1 : platform is concrete, Android & IOS is extending it and have a fn.
problem : platform will not recognize that fn, no naming convention or contract. Srp OCP violation
solution : make platform abstract.
Note : it is extensible,

Scenario 2 : I am adding a navbar, I have to modify platform, android, ios, etc.
problem : platform should have platform specific fns, not android specific. SRP violation
solution : use abstract factory
Note : adding a new windows, we don't touch Platform, and it has only specific fn. OCP true, Srp true.

*/
