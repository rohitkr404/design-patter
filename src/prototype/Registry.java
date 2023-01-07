package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private static Map<String,Student> studentRegister = new HashMap<>();

    public static void register(String key,Student student){
        studentRegister.put(key,student);
    }

    public static Student get(String key){
        return studentRegister.get(key).clone();
    }
}
