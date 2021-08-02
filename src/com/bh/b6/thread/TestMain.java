package com.bh.b6.thread;

public class TestMain {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		Thread thread = new Thread(t3);
		
		t1.start(); //run() 실행, a - z
		
		t2.start(); //run() 실행, 0 - 24
		
		thread.start(); // A - Z

	}

}
