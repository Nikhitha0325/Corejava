package com.siiiet.Application;

import com.siiiet.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges, deliverycharges);
	
	}
 public void bookproduct(float charges) {
	 System.out.println("Dear Normal users,your product charges are:"+getCharges()+"deliverycharges"+getDeliverycharges());
 }
}
