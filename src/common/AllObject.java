package common;

import page.DetailsPage;

public class AllObject {
	
	public static DetailsPage getDetailsPage(){
	
	DetailsPage dt=(DetailsPage)ObjectFactoryAllPages.getMethod(PAGE.DETAILSPAGE);
	return dt ;
	}

}
