package NewFeaturesInSelenium;

public interface RedBusInterface {

	final String clickOnFromCity = "(//div[@class='sc-ifAKCX gLwVlD'])[1]";
	final String fromCityInput = "Chop";
	final String expectedNameToShow = "Chopda";
	final String toCityInput = "Nashik Pha";
	final String expectedNameToShowForSelect = "Nashik Phata";
	final String monthName = "Oct 2024";
	final String fromInputXpath = "(//input[@class='sc-bxivhb hrsLPT'])[1]";
	final String fromListOfCities = "//ul[@class='sc-dnqmqq eFEVtU']/li/div/text";
	final String toInputXpath = "//input[@class='sc-bxivhb hrsLPT']";
	final String toListOfCities = "//ul[@class='sc-dnqmqq eFEVtU']/li/div/text[1]";
	final String months = "//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]";
	final String dateBlock = "//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']";
	final String clickOnNextDateMonth = "//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'][3]";
	final String listOfDates = "//div[@class='DayTilesWrapper__RowWrap-sc-19pz9i8-1 fGGTDM']/span/div";
	final String searchBus = "//button[text()='SEARCH BUSES']";
	
}
