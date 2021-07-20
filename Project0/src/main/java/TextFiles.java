
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFiles<T> {

	// creating a property
	static String fileName = "filename.txt";
	public static File myFile = new File(fileName);

	public static void save(WebsiteAccount websiteAccount) {
		// creating files
		try {

			if (myFile.createNewFile()) {
				System.out.println("file created:" + myFile.getName());
			} else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		write(websiteAccount);
	}

	public static List<String> read() {
		List<String> lines = new ArrayList<String>();

		try {
			Scanner myReader = new Scanner(myFile);

			while (myReader.hasNextLine()) {
				lines.add(myReader.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		return lines;

	}

	public static void write(WebsiteAccount websiteAccount) {
		// save information to file

		try {
			FileWriter myWriter = new FileWriter(fileName, true);
			// filewriter method
			myWriter.write(websiteAccount.toString());
			myWriter.close();
			System.out.println("file has been written to");

		} catch (IOException e) {
			System.out.println("an error occured");
			e.printStackTrace();

		}
	}

	public List<T> readObjectsFromFile(String filename) {
		List<T> objects = null;
		try (ObjectInputStream o = new ObjectInputStream(new FileInputStream(filename));) {
			objects = (ArrayList<T>) o.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objects;
	}

	public void writeObjectsToFile(List<T> objects, String filename) {
		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(filename));) {
			o.writeObject(objects);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
