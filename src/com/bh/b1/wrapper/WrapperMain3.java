package com.bh.b1.wrapper;

public class WrapperMain3 {
	
	public static void main(String[] args) {
		String jumin = "920506-1992506";
		String [] j = jumin.split("-");
		for(int i=0;i<j.length;i++) {
			System.out.println(j[i]);
		}
		jumin = j[0]+j[1]; //9912241234567
		
		//9  9  1  2  2  4  -  1  2  3  4  5  6 : 7은 검증번호
	//  * 2  3  4  5  6  7     8  9  2  3  4  5
	//    18 + 27 + 4 + 10 + 12 + 28  +  8 + 18 + 6 + 12 + 20 + 30 = 122(a)
		
		//2. 122를 11로 나누어서 나머지 구하기
		//나머지 = 1
		//3. 11에서 나머지를 빼기(11-1) 검증번호랑 같으면 올바른 번호
		//3-1. 11에서 나머지를 뺐을 때 두자리 이상이라면
		//4. 3번에서 나온 결과를 다시 10으로 나누어서 그 나머지를 구하기
		//   나머지 숫자랑 검증 번호랑 같으면 올바른 번호
	//charAt, valueOf, substring, split
		int sum = 0;
		int add = 2;
		String [] n = new String[jumin.length()-1];
		int [] ns = new int[jumin.length()-1];
		
		for(int i=0;i<n.length;i++) {
			
			if(add>9) {
				add=2;
				
			}
			
			n[i] = jumin.substring(i, i+1);
			ns[i] = Integer.parseInt(n[i]);
			sum = sum + ns[i]*add;
			add++;
			
		}
		
		System.out.println(sum);
		
		//11로 나눈 나머지
		int a = sum%11;
	
		
		//3. 11에서 나머지 빼기
		int b=11-a;
		
		if(b>9) {
			b = b%10;
		}
		
		int last = Integer.parseInt(jumin.substring(12));
		
		if (last==b) {
			System.out.println("올바른 주민번호 입니다.");
		}else {
			System.out.println("올바르지 않은 주민번호 입니다.");
		}
		
		
		
	}

}
