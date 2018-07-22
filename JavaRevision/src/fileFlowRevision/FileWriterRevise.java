package fileFlowRevision;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterRevise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Text1.txt")))) {
			bw.write("This is first line");
			bw.newLine();
			bw.write("This is second line");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
