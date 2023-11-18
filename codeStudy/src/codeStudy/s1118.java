package codeStudy;

import java.util.*;

public class s1118 {
	
    public int solution1(int price) {
        int answer = 0;
        if(price>=100000){
            switch(price/100000){
                case 1 : case 2 : answer=(int)(price-(price*0.05)); break;
                case 3 : case 4 : answer=(int)(price-(price*0.1)); break;
                case 5 : case 6 : case 7 : case 8 : case 9 : case 10 : answer=(int)(price-(price*0.2)); 
             }
        }else{
            answer=(int)price;
        } 
        return answer;
   }
    
    public int solution2(int[] array, int height) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            answer=array[i]>height?answer+1:answer;
        }
        return answer;
    }
    
    public int[] solution3(int[] num_list) {
        int temp[]=new int[num_list.length];
        for(int i=0;i<num_list.length;i++){
            temp[num_list.length-(i+1)]=num_list[i];
        }
        return temp;
    }
    
    public int solution4(String num_str) {
        int answer = 0;
        for(int i=0;i<num_str.length();i++){
            char c=num_str.charAt(i);
            answer+=c-'0'; //문자를 정수로 변환할 때 각 문자의 아스키 코드값이 더해지기 때문에 그 값을 빼주어야 함..(어쩐지 자꾸 47인가 부터 더하더라..)
        }
        return answer;
    }

	public static void main(String[] args) {
		s1118 instance=new s1118();
		//1. 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
		//구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
		int result1=instance.solution1(580000);
		System.out.println(result1);
		
		//2. 머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다. 
		//머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때, 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
		int array[]= {149, 180, 192, 163};
		int height=167;
		int result2=instance.solution2(array, height);
		System.out.println(result2);
		
		//3. 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
		int array2[]= {1,0,1,2,6,7,1};
		int result3[]=instance.solution3(array2);
		for(int i=0;i<result3.length;i++) {
			System.out.print(result3[i]);
		}
		System.out.println();
		//4.
		int result4=instance.solution4("123456789");
		System.out.println(result4);
		
	}

}
