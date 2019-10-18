//User Defined Exception(Custom Exception)
//with using Try,catch,finally along with Throw.
class Userdefined {
	void func() {
		try {
			int age = 19;
			if(age >=18)
			{
				System.out.println("Vote Done.");
			}
			else
			{
				throw new AgeException();
			}
			}
		catch(AgeException ae)
			{
				System.out.println(ae);
			}
		finally
		{
			System.out.println("Next Voter Come.");
		}
			}
static public void main(String args[])
		{
			Userdefined obj = new Userdefined();
			obj.func();
		}}
class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("Under 18 Problem");
	}
}
/*
output - 
Vote Done.
Next Voter Come.
*/

