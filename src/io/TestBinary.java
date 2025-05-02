package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("E:\\T.jpg");

		FileOutputStream out = new FileOutputStream("E:\\Study\\Programs\\Java IO\\cj.jpg");

		int ch = in.read();

		while (ch != -1) {

			out.write(ch);

			ch = in.read();

		}
		out.close();
		in.close();
	}
}