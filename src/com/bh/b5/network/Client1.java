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

public class Client1 {

	public static void main(String[] args) {
		// Client 용
		// Ip +port -> Socket
		Socket sc = null;
		
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			//서버 접속 전
			sc = new Socket("127.0.0.1", 8282);
			//서버 접속
			System.out.println("서버와 접속이 성공");
			
			boolean check = true;
			
			//무한반복을 위해서
			while(check) {
				//서버로 메세지 전송
				System.out.println("서버로 보낼 메세지를 입력");
				String message = scanner.nextLine();
				
				//byte 처리
				os = sc.getOutputStream();
				//문자 처리
				ow = new OutputStreamWriter(os);
				//문자열 처리
				bw = new BufferedWriter(ow);
				bw.write(message+"\r\n");
				bw.flush();
				System.out.println("서버로 메세지 전송 성공");
				
				//Server에서 보낸 message를 받아서 출력
				
				if(message.toUpperCase().equals("Q")) {
					break;
				}
				
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				message  = br. readLine();
				
				System.out.println("서버에서 보낸 메세지");
				System.out.println("Server : "+message);
				
				if(message.toUpperCase().equals("Q")) {
					break;
				}
				
			}//while의 끝
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				
				sc.close();
				scanner.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
