package com.bh.b1.String;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
		String n = "Hello World";
		String n2 = n.replace('l', 'z');
		
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(n.indexOf('W'), 8);
		System.out.println(n3);
		
		System.out.println("==================");

		Scanner sc = new Scanner(System.in);
		//
		System.out.println("저장할 파일명을 입력");
		//예시 = bh.text, bbh.jpg,... (확장자 포함)
		//입력 받은 파일이 이미지 파일인지 아닌지 구분하기
		//이미지파일 형식 = jpg, gif, png, svg
		String [] piles = {"jpg", "gif", "png", "svg"};
		
		String pile = sc.next();
//		String pile = "bh.png";
		
		//.의 인덱스 번호 찾기
		String p = pile.substring(pile.lastIndexOf(".")+1);

		boolean check = false;
		
		for(int i=0;i<piles.length;i++) {
			if(p.equals(piles[i])) {
				check = true;
				break;
			}
		}
		//
		if(check) {
			System.out.println("이미지 파일");
		}else{
			System.out.println("이미지 파일 아님");
		}
		
//		if(p.equals("jpg")||p.equals("gif")||p.equals("png")||p.equals("syg")) {
//			
//			System.out.println("이미지 파일입니다.");
//		}else{
//			
//			System.out.println("이미지 파일이 아닙니다.");
//		}
	
	}

}
