
import java.io.File; 
import java.io.FileWriter; 

import java.io.IOException; 


public class TextFiles {

public void save(String userName, String email, String phoneNumber, String birthDate, boolean isTeller) {
	//creating files
	try {
		File myFile = new File("filename.txt"); 
		if(myFile.createNewFile()) {
			System.out.println("file created:" + myFile.getName()); 
		}else {
			System.out.println("file already exists");  
		}
	}catch(IOException e) {
		System.out.println("an error occured"); 
		e.printStackTrace(); 
	}
	
	//save information to file
	
	try {
		FileWriter myWriter = new FileWriter("filename.txt"); 
		myWriter.write("UserName: " + userName +", " + "Email: "+ email + ", " + "Phone Number: " + phoneNumber + ", " + "Birthdate: " + birthDate + ", " + "Teller: " + isTeller); 
		myWriter.close();
		System.out.println("file has been written to"); 
		
	}catch (IOException e) {
		System.out.println("an error occured"); 
		e.printStackTrace(); 
		
	}
	
	
	
}


	
public void read() {
	
}
	
public void write() {
	
	}

}
	
