package codeStudy;

import java.util.*;

public class s1113 {
	
    public int solution1(int[] numbers) {
        Arrays.sort(numbers);     
        int length=numbers.length;
        int result=numbers[0] * numbers[1]>numbers[length - 1] * numbers[length - 2]?numbers[0] * numbers[1]:numbers[length - 1] * numbers[length - 2];
        for(int i=0;i<length;i++) {
        	System.out.println(numbers[i]);
        }
  
        return result;
    }

    public int solution2(int order) {
        int num=0;
        int answer=0;

        while (order>0){
            num=order%10;
            if(num==3 || num==6 || num==9) {
            	answer++;
            }
            order=order/10;
        }
        return answer;
    }
    
	public static void main(String[] args) {
		s1113  instance = new s1113();
		//1. 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
	    int[] in = {1, 2, 3, 4, 5};
	    int result1=instance.solution1(in);
	    System.out.println("결과: "+result1);
	    
	    //2. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
	    //머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
	    int result2=instance.solution2(3548);
	    System.out.println("결과: "+result2);
	}

}
