package helloworld;

public class helloworld {

	
	public static void main(String[] args) {
	 for(int j = 3; j <= 10000; j++){
		
		
		
    boolean isPrime = true; 
		for(int i = 2; i<=Math.sqrt(j)&& isPrime;i++){
			if(j % i == 0){
				isPrime=false;
			}
			
			
		}
		if(isPrime){System.out.println(j);}
	
	 }
	}

}
