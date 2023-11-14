package codeStudy;
import java.util.*;
public class s1114 {
	
    public int[] solution1(int money) {
        int[] answer = new int [2];
        int count=0;
        int num=0;
        int money_s=money;
        
        if(money==5500){
            answer[0]=1;
            answer[1]=0;
            return answer;
        }
      
        while(money_s>=5500){
            money_s-=5500;
            count++;        
        }
        answer[0]=count;
        num=money-(5500*count);
        answer[1]=num;
     
        return answer;
    }
    
    public int[] solution2(int[] num_list) {
        
        Arrays.sort(num_list);
        int len=num_list.length;
        int answer[]=new int[len-5];
        for(int i=0;i<len-5;i++){
            answer[i]=num_list[i+5];
        }
        return answer;
    }

    public String solution3(String n_str) {
        int num=Integer.parseInt(n_str);
        String answer = String.valueOf(num);
        return answer;
    }
    
	public static void main(String[] args) {
		s1114  instance = new s1114();
		
		//1. 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 
		//머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		int money=15500;
		int result1[]=instance.solution1(money);
		
		//2. 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		int[] num_list= {31, 20, 38, 14, 5,90};
	    int result2[]=instance.solution2(num_list);

	    
	    //3. 정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
	    String n_str="0010";
	    String result3=instance.solution3(n_str);
	    System.out.println("결과: "+result3);
	    
	}

}
