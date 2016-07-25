package test;

public class ShadowLocalVariable {
	
	static int size= 7;
	
	static void changeIt(int size){
		ShadowLocalVariable.size=size+200;
		System.out.println(ShadowLocalVariable.size+"inside method");
	}
	
	
	
	
	public static void main(String[] args) {
		
		ShadowLocalVariable sd= new ShadowLocalVariable();
		sd.changeIt(size);
		System.out.println(size+"inside main");
		
	}

}
