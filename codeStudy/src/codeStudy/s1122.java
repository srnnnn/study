package codeStudy;

import java.util.*;

public class s1122 {

    public int[] solution1(int[] num_list) {
        int[] answer = {0,0};
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
            	answer[0] += 1;
            }else if(num_list[i]%2!=0){
            	answer[1] += 1;
            }
        }
        return answer;
    }
    
    public int solution2(int[] array, int n) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
        	answer += array[i]==n?1:0;
        }
        return answer;
    }
    
    public int solution3(int[] numbers) {
        
        Arrays.sort(numbers);
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return answer;
    }
    
    public int solution4(int n) {
        int answer = 0;
        while(n > 0){
            answer +=n%10;
            n/=10;
        }
        return answer;
    }
    
    public String solution5(String my_string) {
        String answer = "";
        
        for(int i=my_string.length()-1;i>=0;i--){
            char c=my_string.charAt(i);
            answer += c;
        }
        return answer;
    }
    
	public static void main(String[] args) {
		s1122 instance = new s1122();
		
		//1.(짝수 홀수 개수)정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		int num_list[]= {1,2,3,4,5};
		int result1[] = instance.solution1(num_list);
		for(int i=0;i<result1.length;i++) {
			System.out.print(result1[i]+",");
		}
		System.out.println();
		//2.(중복된 숫자 개수)정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
		int array[]= {1,1,1,2,3,4,5};
		int result2 = instance.solution2(array, 1);
		System.out.println(result2);
		
		//3. (최댓값 만들기) 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
		int numbers[]= {10,2,3,24,56};
		int result3=instance.solution3(numbers);
		System.out.println(result3);
		
		//4. (자릿수 더하기)정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요
		int result4=instance.solution4(12345);
		System.out.println(result4);
		
		//5. (문자열 뒤집기) 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
		String result5=instance.solution5("hello");
		System.out.println(result5);
	}

}
