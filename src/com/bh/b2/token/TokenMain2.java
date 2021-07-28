package com.bh.b2.token;

import java.util.StringTokenizer;

public class TokenMain2 {

	public static void main(String[] args) {
		
		String str = "korea-USA-china*France*UK-canada-germany";

		//나라별로 파싱
		//모든 나라 이름은 대문자로 출력
		str = str.replace("*", "-");
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str, "-");
		
		while(st.hasMoreTokens()){
			String n = st.nextToken().trim();
			n = n.trim().toUpperCase();
			System.out.println(n);
		}
	}

}
