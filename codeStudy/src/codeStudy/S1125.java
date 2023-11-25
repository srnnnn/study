package codeStudy;

import java.util.*;

public class S1125 {
	
    public boolean solution1(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        
        for(int i=0;i<phone_book.length;i++) {
        	String s = phone_book[i];
            if(i==phone_book.length-1){
                break;
   		
            }else if(phone_book[i+1].startsWith(s)) {
                answer = false;
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		S1125 instance = new S1125();
		//1. (알고리즘 - 전화번호 목록)
		String phone_book[]= {"119", "97674223", "1195524421"};
		boolean result1 = instance.solution1(phone_book);
		System.out.println(result1);

	}

}
