package com.bh.b4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {

	public void write2() {
		//id, pw, age 입력
		//c->test->member.txt에 id,pw,age 입력
		
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\test", "member.txt");
		
		
		System.out.println("아이디를 입력하세요 'ㅅ'");
		String id = sc.next();
		System.out.println("비밀번호를 입력하세요 'ㅅ'");
		String pw = sc.next();
		System.out.println("나이를 입력하세요 'ㅅ'");
		int age = sc.nextInt();
				
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(id+"\r\n"+pw+"\r\n"+age+"\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void write() {
		Scanner sc = new Scanner(System.in);
		
		File file = new File("C:\\test", "test.txt");
		
		System.out.println("메세지를 입력하세요.");
		String message = sc.nextLine();
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(message+"\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
