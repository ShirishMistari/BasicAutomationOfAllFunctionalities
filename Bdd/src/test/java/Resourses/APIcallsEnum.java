package Resourses;

public enum APIcallsEnum {

	addPlaceAPI("maps/api/place/add/json"),
	getPlaceAPI("maps/api/place/get/json"),
	deletePlaceAPI("maps/api/place/delete/json");
	
	private String apiResourses;
	
	 APIcallsEnum(String apiResourses) {
		this.apiResourses=apiResourses;
	}
	 public String getResoursess() {
		 return apiResourses;
	 }
	
	
}
