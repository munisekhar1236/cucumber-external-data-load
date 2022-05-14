package com.sample.core.data.read;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonReader implements DataReader {

	@Override
	public List<Map<String, String>> readFile(String filePath, Object sectionName)
			throws InvalidFormatException, IOException {
		return getData(filePath);
	}
	
	public List<Map<String,String>> getData(String filePath) throws IOException {
		List<Map<String, String>> data = new ArrayList<>();
		JSONArray array = readJson(filePath);
		for (int i = 0; i < array.length(); i++) {
			JSONObject obj = array.optJSONObject(i);
			Map<String,String> objData = new LinkedHashMap<>();
			for(String key:obj.keySet()) {
				objData.put(key, obj.optString(key));
			}
			data.add(objData);
		}
		return data;
	}
	
	private JSONArray readJson(String filePath) throws IOException {
		File file = new File(filePath);
		if(file.exists()) {
			String content = FileUtils.readFileToString(file, "UTF-8");
			return new JSONArray(content);
		} else {
			throw new IOException("File not found "+filePath);
		}
	}

}
