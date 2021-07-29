package com.bh.b2.list.ex1;

public class MemberView {
	
	//메서드 이름 = view
	//Mypage 선택 시 실행
	//id, pw, age 출력
	//단, 메서드의 Head는 변경 금지
	//멤버변수 선언 x
	public void view() {
		MemberDTO memberDTO = MemberSession.SESSION.get("member");
		System.out.println("ID: "+memberDTO.getId());
		System.out.println("PW: "+memberDTO.getPw());
		System.out.println("Age: "+memberDTO.getAge());
		
	}

}
