package desing_patterns.factory;

public class PlatformFactory {
    public Platform getPlatform(String str){
        if(str.equals("Android"))
            return new Android();
        else if(str.equals("IOS"))
            return new IOS();
        else if(str.equals("Windows"))
            return new Windows();
        else
            throw new IllegalArgumentException("Not a valid Platform");
    }
}
