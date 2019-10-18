class expdemo
{
	void func1()
	{
		try
		{
			int var1=10;
			int var2=0;
			int res =var1/var2;
			System.out.println("try block ----------Division:"+res);
		}
		catch(Exception e)
		{
			System.out.println("catch block ------------Problem Occur");
			//System.out.printl(e);
			//System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally block --------------No Impact");
		}
	}
void func2()
{
	System.out.println("2nd function is Working");
}
public static void main(String args[]) {
	expdemo obj = new expdemo();
	obj.func1();
	obj.func2();
	}
}


/*output
catch block ------------Problem Occur
finally block --------------No Impact
2nd function is Working
*/


