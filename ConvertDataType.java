package operators;

public class ConvertDataType {
	static short methodOne(long l)
	{
		int i= (int)l;
		return (short)i;
	}
	public static void main(String[]args) 
	{
		double d = 1000.4;
		float f = (float)d;
		byte b = (byte) methodOne((long)f);
		System.out.println(b);
	}

}
