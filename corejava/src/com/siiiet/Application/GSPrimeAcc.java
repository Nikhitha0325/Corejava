package com.siiiet.Application;

import com.siiiet.Framework.PrimeAcc;

public  class GSPrimeAcc extends PrimeAcc {

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	
	}
	
	public void bookproduct(float charges) {
		System.out.println("Dear Prime User,your product charges are:"+getCharges());
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	}
		
	

	


