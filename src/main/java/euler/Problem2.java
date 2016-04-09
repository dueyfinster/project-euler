package euler;

import java.math.BigInteger;

public class Problem2 {
	
	public static int evenFibonacci(int limit){
		BigInteger answer = BigInteger.ZERO;
		BigInteger temp = BigInteger.ZERO;
		BigInteger prev = BigInteger.ONE;
		BigInteger next = BigInteger.valueOf(2);
		
		for(int i=0; i<10; i++){
			temp=prev.add(next);
			prev=next;
			next=temp;
			if(temp.intValue()%2==0){
				System.out.println(temp);
				answer=temp;
			}
		}
		
		return answer.intValue();	
	}
	
	
	public static void main(String[] args) {
		System.out.println(evenFibonacci(0));
	}

}
