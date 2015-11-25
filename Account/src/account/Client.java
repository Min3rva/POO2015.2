package account;

public class Client {
	String name;
	String address;
	
	Client(String n, String a){
		this.name = n;
		this.address = a;
	}
	
	String getName(){
		return this.name;
	}
	
	String getAddress(){
		return this.address;
	}
	
	void setName(String n){
		this.name = n;
	}
	
	void setAddress(String a){
		this.address = a;
	}
	
	public String toString(){
		String str = "Name: " + this.name + ", Address: " + this.address; 
		return str;
	}
}
