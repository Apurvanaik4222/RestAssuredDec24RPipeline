package resources;

import pojo.Location;
import pojo.Places;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

    public static Places addPlacePayload(String name, String language, String address) {

        Places places = new Places();
        places.setAccuracy(50);
        places.setName(name);
        places.setPhone_number("(+91) 983 893 3937");
        places.setAddress(address);
        places.setWebsite("http://google.com");
        places.setLanguage(language);

        Location location = new Location();
        location.setLat(-38.383494);
        location.setLng(33.427362);
        places.setLocation(location);

        List<String> types = new ArrayList<>();
        types.add("shoe park");
        types.add("shop");
        places.setTypes(types);
        return places;
    }

    public static String deletePlacePayload(String place_id){

        return "{\n" +
                "    \"place_id\":\""+place_id+"\"\n" +
                "}\n";
    }
}
