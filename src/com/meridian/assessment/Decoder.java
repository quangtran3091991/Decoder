package com.meridian.assessment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Decoder {

	public static String Decode(String message) {
		StringBuilder decodedMessage = new StringBuilder();
		for (char c : message.toCharArray()) {
			decodedMessage.append((char) (c - 7));
		}
		return decodedMessage.toString();
	}

	public static void main(String args[]) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("src/resource/input.txt"));
		try {
			while (scanner.hasNext()) {
				String message = scanner.nextLine();
				System.out.println(Decoder.Decode(message));
			}
		} finally {
			scanner.close();
		}
	}
}
