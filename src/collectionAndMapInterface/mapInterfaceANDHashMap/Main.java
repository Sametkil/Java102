package src.collectionAndMapInterface.mapInterfaceANDHashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> country = new HashMap<>();
        country.put("TR","Türkiye");
    //    country.put("TR","TürkiyeYeni");
        country.put("GR","Almanya");
        country.put("ENG","İngiltere");

    //    System.out.println(country.get("TR"));

    //    country.remove(country.get("EN"));
    //    System.out.println(country.get("EN"));

    //    country.clear();

    //    System.out.println(country.size());

        for (String countryKey : country.keySet()){
            System.out.println(countryKey);
        }

        System.out.println("####");

        for (String countryValue : country.values()){
            System.out.println(countryValue);
        }
    }
}
