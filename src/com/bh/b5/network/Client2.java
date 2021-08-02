package com.bh.b5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		//1. Server와 접속
		Socket sc = null;
		Scanner scanner = new Scanner(System.in);
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			sc = new Socket("127.0.0.1", 8282);
			
			System.out.println("서버와 접속 성공");
			//2. 1번 누르면 점심메뉴 2번 누르면 저녁메뉴 3번 누르면 종료
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			
			boolean check = true;
			
			while(check) {
				System.out.println("1. 점심 메뉴 2. 저녁 메뉴 3. 종 료");
				int num = scanner.nextInt();
				
				bw.write(num+"\r\n"); //내가 놓친 부분
				bw.flush();
				
				if(num>2) {
					System.out.println("종   료");
					break;
				}
				
				String str = br.readLine();
				
				System.out.println("MENU : "+str);
				
			}//while문 끝
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				
				bw.close();
				ow.close();
				os.close();
				
				sc.close();
				scanner.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
