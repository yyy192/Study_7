package com.bh.b2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	
	private MemberDAO memberDAO;
	private Scanner sc;
	//init - 초기화
	ArrayList<MemberDTO> ar;
	
	public MemberController() {
		memberDAO = new MemberDAO();
		sc = new Scanner(System.in);
		ar = memberDAO.memberInit();
	}
	
	//1. 회원가입 - 회원정보 추가
	//2. 로그인
	//3. program 종료
	public void start() {
		
		
		boolean check = true;
		while(check) {
			check = beforeLogin();
			afterLogin();
			
		}
	}//start
	
	private void afterLogin() {
		System.out.println("1.Mypage");
		System.out.println("2. Logout");
	}
	
	private boolean beforeLogin() {
		
		System.out.println("1. 회원가입 2. 로그인 3. 종료");
		int num = sc.nextInt();
		boolean flag = true;
		if(num==1) {
			memberDAO.memberAdd(ar);
		
		}else if(num==2) {
			MemberDTO memberDTO = memberDAO.memberLogin(ar);
			if(memberDTO != null) {
				System.out.println(" ");
				System.out.println("아이디,비밀번호가 일치합니다.");
				System.out.println("로그인 성공");
				MemberSession.SESSION.put("member", memberDTO);
				System.out.println(" ");
				
			}else {
				System.out.println(" ");
				System.out.println("아이디,비밀번호가 일치하지 않습니다.");
				System.out.println("로그인 실패");
				System.out.println(" ");
			}
		}else if(num==3) {
			System.out.println("프로그램 종료");
			flag = false;
		}else {
			System.out.println("번호 다시 입력해");
		}
		return flag;
	}

}
