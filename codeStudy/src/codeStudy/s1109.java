package codeStudy;

public class s1109 {

    public int solution1(int hp) {
//    	int g=5;
//    	int i=3;
//    	int b=1;
    	
    	int answer=0;
    	
    	if(hp%5==0) {
    		answer+=hp/5;
    	}else  {
    		answer+=hp/5;
            int temp=hp%5;
    	    
    		if(temp%3==0) {
    			answer+=temp/3;
    		}else {
    			answer+=temp/3;
    			answer+=temp%3;
    		}
    	}
    	
        return answer;

    }
    
    public int solution2(int slice, int n) {
        if(n%slice==0){
            return n/slice;
        }else {
            return n/slice+1;
        }
    }
    
    public int solution3(int n) {
              
        if(n%6==0){
            return n/6;
        }else{
        	int num=1;
        	int temp=6;
            while(!(n%temp==0)){     	 
                if(6*num%n==0) 
                	break;   
                	num++;                                          
            }           
            return num;
        }
       
    }
    
	public static void main(String[] args) {
		
		s1109  instance = new s1109();
		//1. 개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다. 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다. 
		//예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만, 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다. 사냥감의 체력 hp가 매개변수로 주어질 때, 
		//사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
	     int result1 = instance.solution1(23); 
	     System.out.println("결과: " + result1);
	   
	     //2.머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 
	     //피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	     int result2=instance.solution2(7, 10);
	     System.out.println("결과: "+result2);  
	     
	     //3. 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
	     //n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	     int result3=instance.solution3(36);
	     System.out.println("결과: "+result3);  
	}
}
