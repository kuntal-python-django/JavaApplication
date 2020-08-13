package pck;

public class Driver 
{
	String fname, lname;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Driver()
	{
		this.fname ="";
		this.lname = "";
	}
	
	public Driver(String fn, String ln)
	{
		this.fname = fn;
		this.lname = ln;
	}
}
