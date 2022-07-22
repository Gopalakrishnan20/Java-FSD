package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		String signature;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your signature to append to the file:");
		signature=in.next();
		in.close();
		File file=new File("C:\\Users\\USER\\Desktop\\Mphasis\\JAVA\\MultiThreading,ExceptionHandlingAndOOPS\\src\\fileHandling\\test.txt");
		try {
			FileWriter writer =new FileWriter(file);
			BufferedWriter Bwrite=new BufferedWriter(writer);
			Bwrite.write("This is a first sentance.");
			Bwrite.newLine();
			Bwrite.write("This is a second sentance.");
			Bwrite.newLine();
			Bwrite.write("This is a 3rd sentance.");
			Bwrite.write("Final sentance Signature of Gopalakrishnan Below.");
			Bwrite.newLine();
			Bwrite.write(signature);
			Bwrite.flush();
			Bwrite.close();
			FileReader reader=new FileReader(file);
			BufferedReader Bread=new BufferedReader(reader);
			String line=Bread.readLine();
			int lineCount=0;
			int sentanceCount=0;
			int wordCount=0;
			int charCount=0;
			System.out.println("The Actual Content:");
			while(line!=null)
			{
				String[] sentance=line.split("[.]");
				sentanceCount+=sentance.length;
				String[] word=line.split(" ");
				wordCount+=word.length;				
				System.out.println("\t"+line);
				charCount+=line.length();
				line=Bread.readLine();
				lineCount++;
			}
			System.out.println("No. of Lines in the File: "+lineCount);
			System.out.println("No. of Sentances in the File: "+sentanceCount);
			System.out.println("No. of Words in the File: "+wordCount);
			System.out.println("No. of Characters in the File: "+charCount);
			InputStream input=new FileInputStream("C:\\Users\\USER\\Desktop\\Mphasis\\JAVA\\MultiThreading,ExceptionHandlingAndOOPS\\src\\fileHandling\\test.jpg");
			OutputStream output=new FileOutputStream("C:\\Users\\USER\\Desktop\\Mphasis\\JAVA\\MultiThreading,ExceptionHandlingAndOOPS\\src\\fileHandling\\copiedTest.jpg");
			int content=input.read();
			while(content!=-1)
			{
				output.write(content);
				content=input.read();
			}
			output.flush();
			input.close();
			output.close();
			Bread.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

