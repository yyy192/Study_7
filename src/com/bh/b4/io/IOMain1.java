package com.bh.b4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		
		//byte단위 처리 //1byte씩 처리 //한글은 2byte
		InputStream is = System.in; 
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Start");
		
		
		
		
		//Scanner가 돌아가는 원리
		
		try {
//			int num = is.read();
//			char ch = (char)num;
			
			String str = br.readLine();
			
			System.out.println(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Finish");
		
	}

}
