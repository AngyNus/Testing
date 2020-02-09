package testing;



public class Event {
	
	Proxy prox = new Proxy();
	
	public boolean addEvent(String Ename, String desc, String Hname,
			String Date, String time, double price, String Ldate){
		return prox.addEvent(Ename, desc, Hname, Date, time, price, Ldate);
			
	}
	
	public boolean orderEvent(String name, String phone){
		return prox.orderEvent(name, phone);
		
	}
	
}
