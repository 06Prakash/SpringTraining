package fileFlowRevision;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderRevise {

	public static void main(String[] args) {
		String line = null;
		try(BufferedReader br = new BufferedReader(new FileReader(new File("TextFile")))) {
			while((line = br.readLine())!= null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try(Scanner in = new Scanner(new File("TextFile"))) {
			while(in.hasNextLine()) {
				System.out.println("=====================");
				System.out.println(in.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
			
		

	}

}
