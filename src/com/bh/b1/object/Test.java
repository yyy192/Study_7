package com.bh.b1.object;

public class Test {
	
	//멤버변수
	int num1=1;
	int num2=2;
	
	//주말동안 할 일
	//ObjectMain에 있는
	//System.out.println(test.equals(test2));  
	//오버라이딩으로 test2를 주소가 아닌 멤버변수로 재정의해서
	//true를 출력할 수 있도록 하기
	
	@Override
	public boolean equals(Object obj) {
		
		Test test2 = (Test)obj;
		boolean check = false;
		if(this.num1 ==test2.num1 && this.num2==test2.num2) {
			check = true;
		}
		
		return check;
	}
	
	

}
