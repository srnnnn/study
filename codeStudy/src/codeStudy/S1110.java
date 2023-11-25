package codeStudy;

public class s1110 {
	
    public int solution1(int chicken) {
    	int answer=0;
    	int s_chicken=0;
    	int coupon=0;
    	while(chicken>=10) {
    	s_chicken+=chicken/10;
    	//coupon+=chicken%10==0?1:chicken%10;
    	if(chicken%10==0) {
    		if(chicken==100) {
    			coupon+=1;
    		}
    	}else {
    	coupon+=chicken%10;
    	}
    	chicken/=10;
    	}
    	coupon+=chicken;
    	System.out.println(coupon);
    	while(coupon>=10) {
    	s_chicken+=coupon/10;
    	coupon=coupon%10+coupon/10;
    	}

    	answer=s_chicken;
    	return answer;
    }

	public static void main(String[] args) {
		s1110  instance = new s1110();
		//1. 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 
		//쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 
		//시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
		 int result1 = instance.solution1(1000); 
	     System.out.println("결과: " + result1);
	}

}
