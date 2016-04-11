package euler;

import java.math.BigInteger;

public class Problem3 {
	
	public static int findLargestPrimeFactor(BigInteger toBeFactored){
		BigInteger largest = BigInteger.ZERO;
		for(BigInteger i = BigInteger.valueOf(1); i.compareTo(toBeFactored)<=0; i = i.add(BigInteger.valueOf(1))){
			if(toBeFactored.mod(i).equals(BigInteger.ZERO) && isPrime(i)){
				largest = i;
				System.out.println(largest);
			}
		}
		
		
		return largest.intValue();

	}
	
	static boolean isPrime(BigInteger n) {
		
	    for(BigInteger i = BigInteger.valueOf(2); (BigInteger.valueOf(2).multiply(i)).compareTo(n) < 0; i = i.add(BigInteger.valueOf(1))) {
	        if(n.mod(i).equals(BigInteger.ZERO))
	            return false;
	    }
	    return true;
	}


	public static void main(String[] args) {
		System.out.println("Problem 3: " + findLargestPrimeFactor(new BigInteger("13195")));
	}

}
