package practice;

import java.util.stream.Stream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Practice {

public String convertToCSV(String[] data) {
	return Stream.of(data)
		.map(this:: escapeSpecialCharacters)
		.collect(Collectors.joining(",")); 
}

List<String[]> dataLines = new ArrayList<>(); 
dataLines.add(new String[]
		{"john", "doe"}); 
dataLines.add(new String[])
{"jane", "will"}); 

public void givenDataArray_whenConvertToCSV_thenOutputCreated() throws IOException{
	File csvOutputFile = new File(CSV_FILE_NAME); 
	try(PrintWriter pw= new PrintWriter(csvOutputFile)){
		dataLines.stream()
		.map(this:: convertToCSV)
		.forEach(pw:: println);
	}
}	assertTrue(csvOutputFile.exists()); 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//csv, json, xml, serializing/deserializing, custom parser
		//csv - how to write a csv file and read csv file 
		//write to and read to in a way that allows me to easily convert a website account to textfile or textfile to website account 
	
		
	
	
	}

}
