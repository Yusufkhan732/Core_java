package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestReadByKeyBoard {

	public static void main(String[] args) throws Exception {

		InputStreamReader isReader = new InputStreamReader(System.in); // System.in will take input from system i.e keyboard.

		BufferedReader in = new BufferedReader(isReader);

		PrintWriter out = new PrintWriter(new FileWriter("E:\\Study\\Programs\\Java IO\\Hello2.txt", true));

		String line = in.readLine();

		while (!(line.equals("bye"))) {

			out.println(line);

			line = in.readLine();

		}
		out.close();
		in.close();
	}
}