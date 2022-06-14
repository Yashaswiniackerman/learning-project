package com;

class Bank {
	float getRateOfInterest() {
		return 6.7f;
	}
}
class SBI extends Bank {

	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		//return super.getRateOfInterest();
		return 7.0f;
	}
	
}
class HDFC extends Bank {

	@Override
	float getRateOfInterest() {
		// TODO Auto-generated method stub
		//return super.getRateOfInterest();
		return 6.8f;
	}
	
}
public class Sfs {

}
