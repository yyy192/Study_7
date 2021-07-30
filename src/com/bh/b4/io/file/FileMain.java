package com.bh.b4.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File file = new File("C:\\test");
		
		boolean result = file.exists();
		result = file.isDirectory(); //파일이니?
		System.out.println(result);
		
		//----------------------------------
		
		file = new File(file, "Study.java");
		
		result = file.exists();
		System.out.println(result);
		
	}

}
