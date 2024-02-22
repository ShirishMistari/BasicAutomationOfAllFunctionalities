package Resourses;

import java.util.ArrayList;
import java.util.List;

import Pojo.AddPlacepojo;
import Pojo.Location1;

public class TestData {

	public AddPlacepojo getMeTestDataPayload(String name,String address,String language) {
		 AddPlacepojo ap = new AddPlacepojo();
		 ap.setAccuracy(50);
		 ap.setName(name);
		 ap.setPhone_number("(+91) 983 893 3937");
		 ap.setAddress(address);
		 ap.setWebsite("http://google.com");
		 ap.setLanguage(language);
		 List<String> StringList = new ArrayList<String>();
		 StringList.add("shoe park");
         StringList.add("shop");
         ap.setTypes(StringList);
         Location1 l = new Location1();
         l.setLat(-38.383494);
         l.setLng(33.427362);
         ap.setLocation(l);
         return ap;
	}
	public String deletePayload(String place_id) {
        return "{\r\n"
        		+ "    \"place_id\":\""+place_id+"\"\r\n"
        		+ "}";
	}
}
