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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		ArrayList<String> dish = new ArrayList<String>();
//		ArrayList<String> dinner = new ArrayList<String>();
		
		dish.add("김치찌개");
		dish.add("오므라이스");
		dish.add("샌드위치");
		dish.add("치즈라면");
		dish.add("먹다 남은 치킨");
	
		String [] dinner = {"스파게티", "피자", "새우", "샐러드"};
		
		//1. Client 접속 준비
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속 기다리는 중");
			
			//2. Client와 접속성공
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			Random random = null;
			
			//3. Client로 메세지 수신
			// 1이면 점심메뉴 중 하나 전송 
			//2면 저녁메뉴 중 하나 전송
			//3이면 프로그램 종료
			
			boolean check = true;
			
			while(check) {
				
//				Calendar calendar = Calendar.getInstance();
				
				random = new Random();
				
				String select = br.readLine(); //내가 놓친 부분
				//client에서 int 입력받고 그걸 string으로 바꿔서
				//client엔 String타입으로 가져와야함
				//그리고 그걸 다시 int타입으로
				
				System.out.println("CLIENT : "+select);
				
				int num = Integer.parseInt(select);
				String menu = null;
				
				if(num==1) {
//					int i = random.nextInt(dish.size());
					menu = dish.get(random.nextInt(dish.size()));
				}else if(num==2) {
//					int i = random.nextInt(dinner.length);
					menu = dish.get(random.nextInt(dish.size()));
				}else {
					break;
				}
				
				bw.write(menu+"\r\n");
				bw.flush();
				
			}//while문 끝

		} catch (Exception e) {
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
				
				ss.close();
				sc.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
