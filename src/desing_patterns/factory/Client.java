package desing_patterns.factory;

import desing_patterns.factory.components.Button.Button;
import desing_patterns.factory.components.navbar.Navbar;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        PlatformFactory pf = new PlatformFactory();

        Platform p = pf.getPlatform(input);
        p.check();
        p.version();

//        Button b = p.getButton();
//        b.check();

//        Navbar n = p.getNavbar();
//        n.check();

        UIComponentFactory uiFactory =  p.getUICompFactory();
        Button b = uiFactory.getButton();
        b.check();
        Navbar n = uiFactory.getNavbar();
        n.check();
    }
}
`