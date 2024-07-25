package com.siiiet.Application;

import com.siiiet.Framework.NormalAcc;
import com.siiiet.Framework.PrimeAcc;
import com.siiiet.Framework.Shopfactory;

public class GSShopFactory implements Shopfactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
	PrimeAcc primeacc=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliverycharges) {
		NormalAcc normalacc=new GSNormalAcc(accNo,accNm,charges,deliverycharges);
		return normalacc;
	}
	
	
	

}
