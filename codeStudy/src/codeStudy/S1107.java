package codeStudy;

public class S1107 {
	
	int solution1(int num1, int num2) {
	    double answer1 = (double)num1/num2*1000;
	    int answer=(int)answer1;
	    return answer;
	}

	int solution2(int num1, int num2) {
	    int answer=-1;
	    if(num1==num2){
	        answer=1;
	        return answer;
	    }
	    return answer;
	}
	
    public int[] solution3(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
    
	public static void main(String[] args) {
		
		 S1107 instance = new S1107();
		//1. 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
	     int result1 = instance.solution1(3,2); 
	     System.out.println("결과: " + result1);
		
	    //2. 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요. 
	    int result2 =  instance.solution2(2, 3);
	    System.out.println("결과: " + result2);
	    
	    //3. 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
	    int[] inputArray = {1, 2, 3, 4, 5};
	    int result3[]=instance.solution3(inputArray);
	}

}
