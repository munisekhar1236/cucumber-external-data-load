package com.sample.helper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public interface DataReader {
	
	/**
	 *  file path is nothing but path of the data file like excel , json or xml ..
	 * @param excelFilePath
	 * @param sectionName
	 * @return
	 */
	public List<Map<String, String>> readFile(String filePath, Object sectionName) throws InvalidFormatException, IOException;

}
