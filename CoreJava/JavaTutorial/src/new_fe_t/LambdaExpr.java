package new_fe_t;

import new_fe_t.FuncInterface;

public class LambdaExpr {

	public static void main(String[] args) 
	{
		
		 FuncInterface fobj = (int x, int y, int z)->System.out.println(x + y + z); 
		 
		 fobj.abstractFun(5, 7, 3);
	}

}
