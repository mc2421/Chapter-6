package tutorials;

public class forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Count to 10");
		
		for(int x = 0; x<= 100; ++x)
		{
			System.out.println(x + "");
		}
		
		int y = 0;  
		while(y<=100)
		{ 
			System.out.println(y + "");
			++y;
		}

		int z=0;
		
		
		do 
		{
			System.out.println(z + "");
			++z;
			
			System.out.println("Would you like to do another Triangle?");
			}while(z != 100);
			
	}

}
