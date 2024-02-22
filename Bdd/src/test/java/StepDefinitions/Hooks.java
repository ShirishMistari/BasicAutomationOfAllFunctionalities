package StepDefinitions;

import java.io.IOException;
import io.cucumber.java.Before;
import Resourses.APIcallsEnum;
public class Hooks {
   @Before("@deletePlace")
	public void runPre_requisitesTests() throws IOException {
		StepDefinitionss sd = new StepDefinitionss();
		if(StepDefinitionss.place_id==null) {
			sd.add_place_payload_with("Dhanraj","Baroda","Gujarathi");
			sd.user_calls_with_http_request("addPlaceAPI","POST");
			sd.verify_place_id_created_maps_to_using("Dhanraj","getPlaceAPI");
		}
	}
	
}
