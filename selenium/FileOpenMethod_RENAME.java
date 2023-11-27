package com.selenium;

import java.io.IOException;

public class FileOpenMethod_RENAME {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("Notepad.exe","C:\\Users\\lenovo\\Documents\\Selenium Intro.txt");
		pb.start();

	}

}
