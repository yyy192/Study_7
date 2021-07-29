package com.bh.b2.random;

import java.util.Random;
import java.util.HashSet;

public class Lotto {
	
	//메서드명 = makeLottto
	//1 - 45 6개 중복x
	
	public HashSet<Integer> makeLotto(){
		
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<Integer>();
			
		
		while(hs.size()!= 6) {
		int num = random.nextInt(45);
		hs.add(num+1);
		}
		
		return hs;
	}
	
	
	//중복 알고리즘 통한 코드 완성해보기
//	public int [] makeLotto() {
//		int [] nums = new int[6];
//		Random random = new Random();
//		
//		for(int i=0;i<nums.length;i++) {
//			nums[i] = random.nextInt(45)+1;
//			
//			for(int j=0;j<i;<j++) {
//				if(nums[j]==nums[i]) {
//					i--;
//					break;
//					
//				}
//			}
//			
//		}
//		return nums;
//	}
	
	
	
	
	
	
	
	
	
//	public ArrayList<Integer> makeLotto(){
//		
//		// 1-45 번호 6개를 랜덤하게 추출
//		// list에 추가하고 return
//		
//		Random random = new Random();
//		ArrayList<Integer> ar = new ArrayList<Integer>(); 
//		
//		for(int i=0;i<6;i++) {
//			int num = random.nextInt(45);
//			ar.add(num+1);
//			
////			int num = random.nextInt(46);
////			if(num==0) {
////				i--;
////				continue;
////			}
////			ar.add(num);
//		}
//		return ar;
//	}


}
