package test;

public class InstanceOfTest {

	public static void main(String[] args) {
		
		String s = new String("Hello");
		InstanceOfTest st= new InstanceOfTest();
		if (s instanceof String){
			System.out.println("hello man");
		}
		
		if (  st instanceof Object){
			
			System.out.println("object super class of every class");
			
		}
		System.out.println(st instanceof Cat);

	}
	
	

}

class Cat{
	
}
