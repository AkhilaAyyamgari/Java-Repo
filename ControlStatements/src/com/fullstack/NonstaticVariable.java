package com.fullstack;
class Bank{
	static String bankname="ICICI";
	static String IFSCcode="ICICI12345";
}
class Customer extends Bank{
	String name;
	String address;
	long accnumber;
	long accbalance;
	
	void deposit(long amount) {
		this.accbalance = this.accbalance+amount;
	}
}
	public class NonstaticVariable {
	
		public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name="Raghu";
		c1.address="Hyderabad";
		c1.accnumber=10100025678l;
		c1.accbalance=1000l;
        System.out.println(c1.name);
        System.out.println(c1.bankname);
        
        Customer c2 = new Customer();
		c2.name="Akhila";
		c2.address="Banglore";
		c2.accnumber=101000256678l;
		c2.accbalance=3000l;
		c2.deposit(2000);
		System.out.println(c2.name);
        System.out.println(c2.accbalance);
        System.out.println(c1.IFSCcode);
        
	}

}
