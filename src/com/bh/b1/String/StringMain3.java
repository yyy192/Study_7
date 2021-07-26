package com.bh.b1.String;

public class StringMain3 {

	public static void main(String[] args) {
		String name = "Hello World";
		char ch = 'o';
		
		//'o'라는 문자가 몇 개 있습니까?
		//2 출력하기
		System.out.println("'o'라는 문자가 몇 개 있나?");
		
		boolean check = true;
		int num = 0;
		int count = 0;
		while(check) {
			
			num = name.indexOf(ch, num);
			
			if (num>0) {
				num = num+1;
				count++;
			}else {
				System.out.println("검색 종료");
				check = false;
			}
		}
		System.out.println(count+"개");

		String name2 = "";
		boolean empty = name2.isEmpty();
		System.out.println(empty);

		//for문으로 다시 코딩해보기
	}

}
