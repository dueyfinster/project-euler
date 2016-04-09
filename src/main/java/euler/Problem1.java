package euler;

public class Problem1 {
	
	public static int addMultiples(){
		int answer = 0;
		
		for(int i=0; i<1000; i++){
			if(i%15!=0 && i%3==0 || i%5==0){
				answer=answer+i;
			}
		}
		return answer;	
	}

	public static void main(String[] args) {
		System.out.println(addMultiples());
	}

}
