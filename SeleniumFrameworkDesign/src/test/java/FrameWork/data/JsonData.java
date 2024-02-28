package FrameWork.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonData {

	public List<HashMap<String, String>> getJsonDataToMap(String FilePath) throws IOException {
		// read json to String 
		String jsonContentn = FileUtils.readFileToString(new File(System.getProperty("user.dir")+ "src\\test\\java\\ShirishAcademy\\data\\PurchaseOrderData.json"),
				StandardCharsets.UTF_8);
		//sTRING TO hASHmAP bY jACKSON dataBind
		ObjectMapper maper = new ObjectMapper();
		JsonParser jsonContent = null;
		List<HashMap<String, String>> data = maper.readValue(jsonContentn,new TypeReference<List<HashMap<String, String>>>(){
			
		});
		return data;
		
}
}