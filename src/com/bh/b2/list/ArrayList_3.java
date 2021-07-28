package com.bh.b2.list;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		//Member 타입을 모으려고 하는 리스트 선언

		ArrayList<Member> ar = new ArrayList<Member>();
		Member member = new Member();
		member.setId("bbh");
		member.setPw("pw");
		ar.add(member);
		
		ar.add(new Member()); //1번 인덱스
		ar.get(1).setId("id"); //Member
		ar.get(1).setPw("pw");
		
		Member member2 = ar.get(0);
		
	}

}
