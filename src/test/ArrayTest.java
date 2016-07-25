package test;

public class ArrayTest {
	
	static int [] year= new int[100];
	
	static int count=0;

	public static void main(String[] args) {
		
		
		for (int i = 0; i < year.length; i++) {
			
			//System.out.println("hello");
			count++;
			
			System.out.println(year[i]);
			
		}
		System.out.println(count);
		

		
	}

}
