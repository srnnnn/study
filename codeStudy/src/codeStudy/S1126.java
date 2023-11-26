package codeStudy;

import java.util.*;

public class S1126 {
	
    public int solution1(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        answer = (sides[0]+sides[1]) > sides[2] ? 1:2;
        
        return answer;
    }
    
    public int solution2(String str1, String str2) {
        int answer = 0;
        int count = 0;
        for(int i=0;i<str1.length();i++) {
        	char c=str1.charAt(i);
        	for(int j=0;j<str2.length();j++) {
        		char d=str2.charAt(j);
        		if(c==d) {
        			count++;
        			break;
        		}
        		if(count==str2.length()) {
        			return 1;
        		}
        	}
        }
        return answer=2;
    }

	public static void main(String[] args) {
		S1126 instance = new S1126();
		
		//1. (삼각형의 완성조건-1) 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
		int sides[]= {199,72,222};
		int result1 = instance.solution1(sides);
		System.out.println(result1);
		
		//2. 
		String str1="ab6CDE443fgh22iJKlmn1o";
		String str2="6CD";
		int result2 = instance.solution2(str1, str2);
		System.out.println(result2);
	}

}
