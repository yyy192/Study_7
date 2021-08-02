package com.bh.b5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		// Server 용
		//Client 연결 요청이 오면 1 : 1 Socket을 생성해 주는
		//Server와 Socket이 있음
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		Scanner scanner = new  Scanner(System.in);
		
		try{
		ss = new ServerSocket(8282);
		System.out.println("Client 접속 기다리는 중");
		
		sc = ss.accept();
		
		System.out.println("Client와 연결 성공");

		boolean check = true;
		
		while(check) {
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String message  = br. readLine();
			
			System.out.println("클라이언트에서 보낸 메세지");
			System.out.println("Client : "+message);
			
			if(message.toUpperCase().equals("Q")) {
				break;
			}
			
			System.out.println("Client로 보낼 메세지 입력");
			message = scanner.nextLine();
			
			//message를 Client로 전송
			//byte 처리
			os = sc.getOutputStream();
			//문자 처리
			ow = new OutputStreamWriter(os);
			//문자열 처리
			bw = new BufferedWriter(ow);
			bw.write(message+"\r\n");
			bw.flush();
			
			if(message.toUpperCase().equals("Q")) {
				break;
			}
			
			System.out.println("메세지 전송 성공");
			} //while의 끝
		} catch(Exception e) {
			
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
				ss.close();
				scanner.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
