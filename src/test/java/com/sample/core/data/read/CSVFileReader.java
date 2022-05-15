package com.sample.core.data.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class CSVFileReader implements DataReader {

	@Override
	public List<Map<String, String>> readFile(String filePath, Object sectionName)
			throws InvalidFormatException, IOException {
		
		List<Map<String, String>> records = null;
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String[] headers = br.readLine().split(",");

			 records = br.lines().map(s -> s.split(",")).map(
					t -> IntStream.range(0, t.length).boxed().collect(Collectors.toMap(i -> headers[i], i -> t[i])))
					.collect(Collectors.toList());
		};

		return records;
	}

}
