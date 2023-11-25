package codeStudy;

import java.util.*;

public class S1120 {
	
    public int[] solution1(int n) {
        int count=0;
        int num=0;
        for(int i=1;i<=n;i++){
            count=i%2!=0?count+1:count+0;        
        }
        int answer[]=new int[count];
        for(int i=1;i<=n;i++){
            if(i%2!=0) {
            	answer[num]=i;
            	num++;
            }
        }

        return answer;
    }
    
    public int solution2(int n, int t) {
        int answer = 0;
        for(int i=1;i<=t;i++){
            n*=2;
            answer=n;
        }
        return answer;
    }
    
    public String solution3(String rsp) {
        String answer = "";
        for(int i=0;i<rsp.length();i++){
            char c=rsp.charAt(i);
            if(c=='2'){
                answer+='0';
            }else if(c=='0'){
                answer+='5';
            }else{
                answer+='2';
            }
        }    
        return answer;
    }
    
    public int[] solution4(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy =  new int[emergency.length];
        for(int i=0;i<emergency.length;i++){
            copy[i]=emergency[i];
        }
        
        Arrays.sort(copy);
        for(int i=0;i<copy.length;i++) {
        	for(int j=0;j<emergency.length;j++) {
        		if(copy[i]==emergency[j]) {
        			answer[j]=emergency.length-i;
        		}
        	}
        }
        
        return answer;
    }

    public String solution5(int age) {
        String age_s=Integer.toString(age);
        String answer = "";
        
        for(int i=0;i<age_s.length();i++) {
        	answer += (char)(age_s.charAt(i)+49);
        }
    
        return answer;
    }
	public static void main(String[] args) {
		S1120 instance=new S1120();
		
		//1. 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
		int result1[]=instance.solution1(10);
		
		//2. 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
		int result2=instance.solution2(7, 15);
		System.out.println(result2);
		
		//3. 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때, 
		//rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.
		String result3=instance.solution3("552");
		System.out.println(result3);
		
		//4. 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
		//정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
		int arr[]= {1,2,3,4,5,6,7};
		int result4[]=instance.solution4(arr);
		for(int i=0;i<result4.length;i++) {
			System.out.print(result4[i]);
		}
		System.out.println();
		
		//5. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
		String result5=instance.solution5(56);
		System.out.println(result5);

	}

}
