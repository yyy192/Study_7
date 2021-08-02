package com.bh.b4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader1 {

	public static void main(String[] args) {
		
		File file = new File("C:\\test", "name.txt");
		FileReader fr= null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			ArrayList<FileMember> ar = new ArrayList<FileMember>();
			while(true) {
				String str = br.readLine();
				
				if(str ==null) {
					break;
				}
				System.out.println(str);
				
				FileMember fm = new FileMember();
				
				//파싱 작업 - StringTokenizer
				StringTokenizer st = new StringTokenizer(str, ",");
				
				//while문이 필요없대 왜그런지 생각해봐☆
				
				while(st.hasMoreTokens()) {
					String id = st.nextToken();
					fm.setId(id);
					
					String pw = st.nextToken();
					fm.setPw(pw);
					
					String age = st.nextToken();
					int age2 = Integer.parseInt(age);
					fm.setAge(age2);
					
					ar.add(fm);
				}
				
				
//				System.out.println(str);
			}

			
			
			for(int i=0;i<ar.size();i++) {
				
				System.out.println("ID: "+ar.get(i).getId());
				System.out.println("PW: "+ar.get(i).getPw());
				System.out.println("AGE: "+ar.get(i).getAge());
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//자원 해제
			//자원과 연결된 역순으로 해제
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
