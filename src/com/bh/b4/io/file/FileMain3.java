package com.bh.b4.io.file;

import java.io.File;

public class FileMain3 {

	public static void main(String[] args) {
		
		File file = new File("C:\\");
		String [] st = file.list();
		File [] files = file.listFiles();
		
		for(int i=0;i<st.length;i++) {
			
			File file2 = new File(file, st[i]);
			System.out.println((i+1)+" "+st[i]);
			
			if(file2.isFile()) {
				System.out.println("파일이다");
			}else {
				System.out.println("폴더이다");
			}
		}
	//program 돌려서 test 폴더 지워보기	
	}

}
