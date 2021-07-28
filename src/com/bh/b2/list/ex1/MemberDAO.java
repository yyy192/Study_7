package com.bh.b2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberDAO {

	//데이터에 접근하는 class
	
	private String info;
	private Scanner sc;
	
	public MemberDAO(){
		info = "iu,pw1,32,suji,pw2,27,choa,pw3,30";
		sc = new Scanner(System.in);
	}
	
	//메서드명 = memberLogin
	//Scanner로 id, pw 입력받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서
	//입력받은 id, pw 둘 다 일치하는 것을 찾아서 해당 DTO를 리턴
	public MemberDTO memberLogin(ArrayList<MemberDTO> ar) {
		
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("ID를 입력하세요.");
		memberDTO.setId(sc.next());
		System.out.println("PW를 입력하세요.");
		memberDTO.setPw(sc.next());
		
		MemberDTO result = null;
		//String 같은지 확인할 땐 equals쓰기!!!!!
		for(int i=0;i<ar.size();i++) {
			if(memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
			result = ar.get(i);
			break;
			}
		}
		
		return result;
	}
	
	//메서드명 = memberDelete
	//Scanner로 id, pw 입력받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서
	//입력받은 id, pw 둘 다 일치하는 것을 찾아서 삭제
	public int memberDelete(ArrayList<MemberDTO> ar) {
//		Scanner sc = new Scanner(System.in);
		
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("삭제할 ID를 입력하세요.");
		memberDTO.setId(sc.next());
		System.out.println("삭제할 PW를 입력하세요.");
		memberDTO.setPw(sc.next());
		
		int result = 0;
		
		//String 같은지 확인할 땐 equals쓰기!!!!!
		for(int i=0;i<ar.size();i++) {
			if(memberDTO.getId().equals(ar.get(i).getId()) && memberDTO.getPw().equals(ar.get(i).getPw())) {
			ar.remove(i);
			result = 1;
			break;
			}
		}
		 
		return result;
	}
	
	
	//메서드명 = memberAdd
	//Scanner로 id, pw, age 입력받아서 MemberDTO 멤버변수
	//매개변수로 ArrayList를 받아서 생성한 MemberDTO를 추가
	public void memberAdd(ArrayList<MemberDTO> ar) {
//		Scanner sc = new  Scanner(System.in);
		
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("추가할 ID를 입력하세요.");
		memberDTO.setId(sc.next());
		
		System.out.println("추가할 PW를 입력하세요.");
		memberDTO.setPw(sc.next());
		
		System.out.println("추가할 나이를 입력하세요.");
		memberDTO.setAge(sc.nextInt());
		
		ar.add(memberDTO);
		
	}
	
	
	//메서드명 = memberInit
	//info에 있는 정보를 파싱해서 memberDTO 객체생성해서 대입
	//ArrayList에 각각 추가하고 리턴
	public ArrayList<MemberDTO> memberInit() {
//		String [] st = this.info.split(",");
//		for(int i=0;i<st.length;i++) {
//			System.out.println(st[i]);
//		}
//		
//		MemberDTO [] memberDTOs = new MemberDTO[st.length/3];
//		int j = -1;
//		ArrayList arraylist = new ArrayList();
//		
//		for(int i=0;i<memberDTOs.length;i++) {
//			
//			MemberDTO memberDTO = new MemberDTO();
//			ar.memberDTO.setId(st[++j]);
//			ar.memberDTO.setPw(st[++j]);
//			ar.setAge(st[++j]);
//			
//			memberDTOs[i] = memberDTO:
//		}
//		
//		return memberDTOs;
		
		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<MemberDTO> ar = new ArrayList<MemberDTO>();
		while(st.hasMoreTokens()) {
				MemberDTO memberDTO = new MemberDTO();
				String id = st.nextToken();
				memberDTO.setId(id);
				
				String pw = st.nextToken();
				memberDTO.setPw(pw);
				
				String age = st.nextToken();
				int age2 = Integer.parseInt(age);
				memberDTO.setAge(age2);
				
				ar.add(memberDTO); //ArrayList에 추가
			}
		
		return ar;	
		
	}
}
