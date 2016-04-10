package euler;

import java.math.BigInteger;

public class Problem6 {
	
	public static BigInteger squares(BigInteger limit){
		BigInteger squared = BigInteger.valueOf(0);
		BigInteger added =  BigInteger.valueOf(0);
		
		for(BigInteger i = BigInteger.valueOf(1); i.compareTo(limit) <= 0; i = i.add(BigInteger.ONE)){
			squared = squared.add(i.pow(2));
			added = added.add(i);
			if(i.compareTo(limit) == 0){
				added = added.pow(2);
			}
		}		
		return added.subtract(squared);
	}

	public static void main(String[] args) {
		System.out.println("Problem 6: " + squares(BigInteger.valueOf(100)));
	}

}
