package common;

public enum PAGE {
	
		DETAILSPAGE("page.DetailsPage"),
		LOGINPAGE("page.LoginPAge"),
		LOGOUTPAGE("page.LogoutPage");
	
	private String className;

    private PAGE(String className) {
        this.className = className;
    }
    
    public String getClassName(){
		return className;
    	
    }
}
