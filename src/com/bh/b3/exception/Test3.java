package com.bh.b3.exception;

public class Test3 {

	public void t3() throws Exception{
		
		//유치원생 - 두자리수까지 읽을 줄 알아
		
			int num1 = 40;
			int num2 = 55;
			
			int num3 = num1 + num2;
			int num4 = num1 - num2;
			
			if(num3>99) {
				throw new MyException("세자리수는 아직 몰라요'ㅅ'");
			}
			if(num4<0) {
				throw new MyException("음수는 아직 몰라요'ㅅ'");
			}
			
			System.out.println(num3);
		
	}
}
