package com.sample.helper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class FileReaderHelper {
	
	public static List<Map<String,String>> getFileData(String filePath,Object section) throws InvalidFormatException, IOException {
		
		if(filePath.endsWith(".xlsx")) {
			return new ExcelReader().readFile(filePath, section);
		} else if(filePath.endsWith(".json")) {
			return new JsonReader().readFile(filePath, section);
		} else if(filePath.endsWith(".xml")) {
			//TODO: implement
		}
		return null;
	}

}
