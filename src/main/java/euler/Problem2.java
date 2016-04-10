package euler;

import java.math.BigInteger;

public class Problem2 {
	
	public static BigInteger evenFibonacci(){
		BigInteger answer = BigInteger.ZERO;
		BigInteger temp = BigInteger.ZERO;
		BigInteger next = BigInteger.valueOf(1);
		BigInteger limit = new BigInteger("4000000");
		
		for(BigInteger i = BigInteger.ONE; temp.compareTo(limit) < 0;){
			//System.out.println(temp +" "+ i +" "+ next);
			temp=i.add(next);
			i=next;
			next=temp;
			if(temp.mod(BigInteger.valueOf(2)) == BigInteger.ZERO){
				answer = answer.add(temp);
				//System.out.println(answer);
			}
		}
		
		return answer;	
	}
	
	
	public static void main(String[] args) {
		System.out.println("Problem 2: " + evenFibonacci());
	}

}
