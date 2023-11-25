package codeStudy;

import java.util.*;

public class S1108 {

	public static void main(String[] args) {
		//1. 중앙값 구하기
		//중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 
		//예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
		
		int array[] = {10, -2, 93, 24, 51};
		Arrays.sort(array); //해당 메서드로 배열을 정렬할 수 있음 (다른 방법으로는 이중for문과 if문으로 temp에 저장하면서 정렬할 수는 방법 있음 (예전 로또))
		int middle=array.length/2;
		System.out.println(array[middle]);
		
		
		//2. 최빈값 구하기
		//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 
		//최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
		int array2[]= {1, 2, 3, 3, 3, 4};
		
		int num=array2[0];
		int total=0;
		for (int i=0;i<array2.length;i++) {		
			if(array2[i]==num) {
				total++;			
			}
			
		}
		System.out.println(num);
		System.out.println(total);
		
		
		//3.
		//머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 
		//모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
		int  n=8;
        if(n==1){
            System.out.println("return 1;");;
        }else if(n%7==0){
            System.out.println("return n/7;");
        }else{
            System.out.println("return n/7+1;");
        }
		
	}

}
