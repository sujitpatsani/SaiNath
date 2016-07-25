package test;

public class RandomName 
{	
	 String name;
	


	public RandomName() {
		this(makeRandomName());
	}



	public RandomName(String name) {
		this.name = name;
	}
	static String name1;
	 static String makeRandomName(){
		
		
		int x=(int)(Math.random()*5);
		System.out.println(x);
		
		
		try{
		 name1= new String[]{"Hello","hhi","hero","heroin"}[x];	 
		}catch(Exception e){
			
		}
			 
	
		
		return name1;
		
	}

	public static void main(String[] args) 
	{
		RandomName rn= new RandomName();
		if(!(rn.name== null)){
		System.out.println(rn.name);
		}
		else
			System.out.println("sujit");
		
	}

}
