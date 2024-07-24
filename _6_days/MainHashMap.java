package _6_days;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MainHashMap {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<>();

        // put item
        map.put("name", "Ali");
        map.put("name", "Ahmet");
        map.put("surname", "Bilirim");
        map.put("email", "ahmet@mail.com");
        map.put("status", "user");

        String name = map.get("name");
        System.out.println(name);

        System.out.println(map.size());

        boolean containsKey = map.containsKey("name");
        System.out.println(containsKey);

        boolean containsValue = map.containsValue("user");
        System.out.println(containsValue);

        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println( key + " : " + map.get(key) );
        }

        Collection<String> values = map.values();
        System.out.println(values);

        Set<Entry<String, String>> entries = map.entrySet();
        for (Entry<String,String> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        map.put("age", "30");
        map.remove("age");

        map.replace("surname", "Bil");

        System.out.println(map);

        // Enum - HashMap
        HashMap<AppEnum, Object> enumMap = new HashMap<>();
        
        enumMap.put(AppEnum.pid, 100);
        enumMap.put(AppEnum.title, "TV");
        enumMap.put(AppEnum.price, 10000);
        enumMap.put(AppEnum.detail, "TV Detail");

        enumMap.remove(AppEnum.price);
        System.out.println( enumMap.get(AppEnum.pid));
        System.out.println(enumMap);

        Map<String, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("name", "Ali");
        linkedMap.put("name", "Ahmet");
        linkedMap.put("surname", "Bilirim");
        linkedMap.put("email", "ahmet@mail.com");
        linkedMap.put("status", "user");
        System.out.println(linkedMap);

    }
}
