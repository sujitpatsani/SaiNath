package test;

public class Init {
	
	
	Init(String s){
		System.out.println("arg construtor");
	}
	Init(){
		System.out.println("Default construtor");
	}
	
	static{
		System.out.println("1st static block");
	}
	
	{
		System.out.println("1st Non static block");
	}
	{
		System.out.println("2nd Non static block");
	}
	static{
		System.out.println("2nd static block");
	}
	
	public static void main(String args[]){
		
		Init in= new Init();
		Init in1=new Init("7");
			
	}
	

}
