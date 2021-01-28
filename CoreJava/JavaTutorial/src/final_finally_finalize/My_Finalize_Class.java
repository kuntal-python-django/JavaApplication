package final_finally_finalize;

public class My_Finalize_Class 
{

	public void finalize()
	{
		System.out.println("finalize called");
	}
	
	public static void main(String[] args) 
	{
		My_Finalize_Class o1 = new My_Finalize_Class();
		My_Finalize_Class o2 = new My_Finalize_Class();
		My_Finalize_Class o3 = new My_Finalize_Class();
		My_Finalize_Class o4 = new My_Finalize_Class();
		o1 = null;
		o2 = null;
		o3 = null;
		o4 = null;
		System.gc();
		System.out.println("Main Completes");
	}
}
