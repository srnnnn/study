package codeStudy;

public class s1117 {

    public int solution1(String message) {
	    int len=message.length();
	    int answer=len*2;
	        return answer;
    }
    
    public String solution2(String rny_string) {
        String answer="";
        for(int i=0;i<rny_string.length();i++){
            char c=rny_string.charAt(i);
            if(c == 'm'){ //char를 비교할 때는 "" X ''로 해야 가능
                answer+="rn";         
            }else{
                answer+=c;
            }   
        }
        return answer;
    }
    
	public static void main(String[] args) {
		s1117 instance=new s1117();
		
		///1. 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며, 
		//편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
		int result1=instance.solution1("happy birthda!");
		System.out.println(result1);
		
		//2. 'm'과 "rn"이 모양이 비슷하게 생긴 점을 활용해 문자열에 장난을 하려고 합니다. 문자열 rny_string이 주어질 때, 
		//rny_string의 모든 'm'을 "rn"으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		String result2=instance.solution2("masterpiece");
		System.out.println(result2);
	}

}
