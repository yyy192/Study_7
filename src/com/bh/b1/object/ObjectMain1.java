package com.bh.b1.object;

public class ObjectMain1 {

	public static void main(String[] args) {
		
		
		//객체 생성
		//클래스명 참조변수명 = new 생성자();
		//Object 객체 생성하기
		Object obj = new Object();
		
		//멤버변수, 멤버메서드 호출
		//참조변수명.변수명;
		//참조변수명.메서드명([인자값들...]);
		int num = obj.hashCode();
		System.out.println(num);

		String str = obj.toString();
		System.out.println(str);
		System.out.println(obj);
		
		Object obj2 = new Object();
		
		boolean result = obj.equals(obj2);
		System.out.println(obj == obj2); 
		System.out.println(result);
		
		Test test = new Test();
		Test test2 = new Test();
		System.out.println(test==test2);
		System.out.println(test.num1==test2.num1);
		System.out.println(test.equals(test2));
//		test.hashCode();
		
//		Object object3 = test;
		
	}

}
