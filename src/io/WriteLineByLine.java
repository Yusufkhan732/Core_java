package io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteLineByLine {
	
	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("E:\\Study\\Programs\\Java IO\\Hello1.txt", true);

		PrintWriter out = new PrintWriter(file);

		out.println("hello bhai");

		out.println("kya haal hai");

		out.close();

		file.close();

		System.out.println("data write successfully...!!!");

	}
}