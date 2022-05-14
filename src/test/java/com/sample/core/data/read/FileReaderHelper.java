package com.sample.core.data.read;

public class FileReaderHelper {
	
	public static DataReader getReader(String filePath) {
		
		if(filePath.endsWith(".xlsx")) {
			return new ExcelReader();
		} else if(filePath.endsWith(".json")) {
			return new JsonReader();
		} else if(filePath.endsWith(".xml")) {
			//TODO: implement
		}
		
		return null;
	}
}
