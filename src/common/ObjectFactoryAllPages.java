package common;

import java.util.HashMap;
import java.util.Map;

public class ObjectFactoryAllPages {
	
	private static Map<PAGE ,AbstractPage> instances= new HashMap<PAGE ,AbstractPage>();
	
	public static AbstractPage getMethod(PAGE Key){
		 
		AbstractPage instance=instances.get(Key);
		
		String name=Key.getClassName();
				
		if(instance==null){
			
			try {
				Class st = Class.forName(name);
				
						instance=(AbstractPage)st.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		instances.put(Key, instance);
		return instance;
		
		
		
	}
	
	

}
