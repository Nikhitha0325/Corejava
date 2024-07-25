package com.siiiet.Main;

import com.siiiet.Application.GSNormalAcc;
import com.siiiet.Application.GSPrimeAcc;
import com.siiiet.Application.GSShopFactory;

public class Client {
	public static void main(String[]args) {
		GSShopFactory obj=new GSShopFactory();
		
		//prime account creation
		GSPrimeAcc ga=(GSPrimeAcc)obj.getNewPrimeAccount(12,"java", 500.6f,true);
		ga.bookproduct(ga.getCharges());
		 
		//normal account creation
		GSNormalAcc ge=(GSNormalAcc)obj.getNewNormalAccount(13,"spring", 500.6f,65.4f);
		ge.bookproduct(ge.getCharges());
	}

}
