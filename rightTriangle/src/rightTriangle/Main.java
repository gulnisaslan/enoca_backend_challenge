package rightTriangle;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1;
		for (int i = 0; i < 6; i++) {
		  for (int j = 0; j < count; j++) {
			System.out.print("*");
		}
		  System.out.println();
		  
		  count+=1;
		
		  if(count>2) {
			  count+=2;
			  count--;
		  }
		    
		
			
		}

	}
}


