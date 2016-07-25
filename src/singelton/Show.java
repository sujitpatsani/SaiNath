package singelton;

import java.util.HashSet;
import java.util.Set;

public class Show {
	
	private static final Show INSTANCE=new Show();
	private Set<String> availbleseats;
	public Show getInstance(){
		return INSTANCE;
	}
	 private Show(){
		 availbleseats = new  HashSet<String>();
		 availbleseats.add("1A");
		 availbleseats.add("1B");
	 }

}
