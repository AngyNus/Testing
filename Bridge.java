package testing;

public interface Bridge {
	
	public boolean addEvent(String Ename, String desc, String Hname,
			String Date, String time, double price, String Ldate);
	
	public boolean orderEvent(String name, String phone);
}
