package com.bh.b4.io.file;

import java.io.File;
import java.util.Scanner;

public class FileMain2 {

	public static void main(String[] args) {
		
		File file = new File("C:\\test");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("폴더명을 입력하세요'ㅅ'");
		String name = sc.next();
		
		file = new File(file, name);
		
		//파일이 존재하면 false, 파일이 존재하지 않으면 true
		if(!file.exists()) {
			file.mkdirs();
			System.out.println(name+"이라는 이름의 새로운 폴더가 생성되었습니다.");
		}

		if(file.exists()) {
			
			file.delete();
			System.out.println(name+"이라는 이름의 폴더가 삭제되었습니다.");
		}else {
			
			file.mkdirs();
			System.out.println(name+"이라는 이름의 새로운 폴더가 생성되었습니다.");
		}
	}

}
