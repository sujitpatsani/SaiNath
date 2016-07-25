package test;

public class AssigningReferenceVariable {
	
	private int height;
	private int length;
	
	public AssigningReferenceVariable(int height,int lenght){
		
		this.height= height;
		this.length= lenght;
	}
	

	public static void main(String[] args) {
		
		AssigningReferenceVariable dimension= new AssigningReferenceVariable(5,10);
		System.out.println("Height ="+ dimension.height +" "+"Length = "+dimension.length );
		
		AssigningReferenceVariable D3=dimension ;
		
		D3.height=20;
		System.out.println("Height ="+ dimension.height+" S"+"Length = "+dimension.length );
		

	}

}
