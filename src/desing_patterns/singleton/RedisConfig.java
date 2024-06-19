package desing_patterns.singleton;
public class RedisConfig {
    private String url;
    private String password;
    private int port;
    private String user;

    private static RedisConfig INSTANCE = null;
    private RedisConfig(String url, String password, int port, String user){
        this.url = url;
        this.password = password;
        this.port = port;
        this.user = user;
    }
    public static RedisConfig getInstance(){
        if(INSTANCE == null)
            INSTANCE = new RedisConfig("localhost", "strong", 3306, "root");
        return INSTANCE;
    }
    public String getUrl(){
        return url;
    }
}
// for multithreading environment
//getInstance(){                  //  put call for when its null only
//    if(INSTANCE == null){
//        Lock.lock();
//        if(INSTANCE == null)
//            INSTANCE = new RedisConfig();
//        Lock.unlock();
//    }
//    return INSTANCE;
//}


// if we use one lock , then multiple objects can also be created .
// we will user double check lock (DCM)
// better use Enum to make serialize
// https://www.baeldung.com/java-singleton