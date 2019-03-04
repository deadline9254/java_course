public class lesson2_1
{
	public static void main(String Args[])
	{
	 int numberOne=45;
	 int numberTwo=33;
		if(numberOne<0 || numberTwo<0) 
				{
					System.out.println("one in number is less then zero!");
				}
			else if (numberTwo!=0) 
				{
					System.out.println("Resul devision "+ ((Float.valueOf(numberOne)/Float.valueOf(numberTwo))));
				}
		if(numberOne>numberTwo) 
				{
					System.out.println("numberOne>numberTwo");
				}
			else if(numberTwo>numberOne)
				{
					System.out.println("numberTwo>numberOne");
				}
			else 
				{
					System.out.println("life is pain! be course numberOne=numberTwo, live with this!");
				}
		if ((numberOne%2)==0) 
				{
					System.out.println("the numberONe is even!");
				}
	}
}