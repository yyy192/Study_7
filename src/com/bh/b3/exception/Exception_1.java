package com.bh.b3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		boolean check = true;
		while(check) {
			try {
				System.out.println("숫자를 입력");
				int num = sc.nextInt();
				//throw new InputMismatchException();
				//catch();
				int num2 = 20;
				
				int num3 = num2/num;
				//예외가 발생하면 예외객체 생성
				//ArithmeticException ar = new ArithmeticException();
				//catch(ar);
				//throw(ar);
				System.out.println(num3);
				check = false;
			}catch(ArithmeticException e) {
				//예외가 발생했을 때 실행
				//예외 처리
				System.out.println("예외처리 끝");
				
			}catch(RuntimeException e) {
				System.out.println("숫자만 입력해");
				sc.next();
			}catch (Exception e) {
				
			}
		}//while문 끝
		
	
		
		System.out.println("Finish");
	}

}
