package codeStudy;

import java.util.*;

public class S1115 {
	
    public int solution1(int n, int k) {
        int count=n/10; 
        int answer = (n*12000)+(k*2000-count*2000);
        return answer;
    }
    
    public int solution2(int n) {
        int answer = 0;
        for(int i=2;i<=n;i+=2){
            answer+=i;
        }    
        return answer;
    }
    
    public double solution3(int[] numbers) {
        double sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        double answer = sum/numbers.length;
        return answer;
    }
    
    public String solution4(String my_string, int n) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            char c=my_string.charAt(i);
            for(int j=0;j<n;j++){
                answer+=c;
            }
        }
        return answer;
    }
    
    public String solution5(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = "";    
        for(int i=0;i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                answer=participant[i];
                break;
            }
        }
        String result=answer.equals("")?participant[completion.length]:answer;
        return result;
    
    }

	public static void main(String[] args) {
		S1115 instance=new S1115();
		//1. 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 
		//정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
		int result1=instance.solution1(64, 6);
		System.out.println("결과: "+result1);
		
		//2. 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
		int result2=instance.solution2(45);
		System.out.println("결과: "+result2);
		
		//3. 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
		int[] numbers= {31, 20, 38, 14, 5,90};
		double result3=instance.solution3(numbers);
		System.out.println("결과: "+result3);
		
		//4. 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
		String result4=instance.solution4("hello", 2);
		System.out.println("결과: "+result4);
		
		//5. 알고리즘 문제 (완주하지 못한 선수)
		//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
		//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
		String[] participant= {"leo", "kiki","filipa", "eden"};
		String[] completion= {"leo", "kiki","eden"};
		String result5=instance.solution5(participant, completion);
		System.out.println("결과: "+result5);
	}

}
