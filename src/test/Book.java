package test;

public class Book {
	
	private String title;
	
	public String getTitle(){
		
		
		return title;
	}

	public static void main(String[] args) {
		Book b= new Book();
		System.out.println(b.getTitle());
		
		String sg=b.getTitle();
		
		if(sg!=null)
		sg.toUpperCase();
		
	}

}
