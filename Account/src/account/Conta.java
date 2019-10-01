package account;

public class Conta {
	String number;
	Client client;
	int saldo;
	
	public Conta() {
		// empty constructor
	}
	
	Conta (String num){
		this.number = num;
		this.saldo = 0;
	}
	
	Conta (String num, Client cl){
		this.number = num;
		this.client = cl;
		this.saldo = 0;
	}
	
	Client getClient(){
		return this.client;
	}
	
	String getNumber()	{
		return this.number;
	}
	
	int getBalance(){
		return this.saldo;
	}
	
	void setClient(Client cl){
		this.client = cl;
	}
	
	void deposit(int value)
	{
		this.saldo += value;
	}
	
	int withdraw(int value)
	{
		if(value <= this.saldo)
		{
			this.saldo -= value;
			return value;
		}
		
		return 0;
	}
	
	boolean transference(Conta acc, int value)
	{
		if(this.saldo >= value)
		{
			this.saldo -= value;
			acc.saldo += value;
			
			return true;
		}
		
		return false;
	}
}
