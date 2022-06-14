package com;

public class WithdrawThread extends Thread
{
	SynchronizedClass obj;
	int amt;
	String msg;
	
	public WithdrawThread(SynchronizedClass obj, int amt) {
		this.obj = obj;
		this.amt = amt;
	}

	@Override
	public void run() {
		try
		{
			Thrad.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		obj,withdraw(amt);
	}
		// TODO Auto-generated method stub
		super.run();
	}
    
}
