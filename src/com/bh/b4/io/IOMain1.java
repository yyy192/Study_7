package com.bh.b4.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		
		//byte단위 처리 //1byte씩 처리 //한글은 2byte
		InputStream is = System.in; 
		
		System.out.println("Start");
		try {
			int num = is.read();
			char ch = (char)num;
			System.out.println(num);
			System.out.println(ch);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Finish");
		
	}

}
