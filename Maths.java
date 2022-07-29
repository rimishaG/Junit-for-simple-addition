
public class Maths {
	public int add(int a, int b)
	{
		if (a<0 || b<0)
			{
			throw new ArithmeticException();
			
			}
		return a+b;
	}
}
