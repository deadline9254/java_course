public class lesson2_2
{
	public static void main(String[] args)
	{
		int Massiv[]={1,2,3,1000,1050,6,7,1001};
		int SumMas=0;
		boolean massMore1000=false;
		
		for (int i=0; i<8;i++)
		{
			SumMas+=Massiv[i];
		if (Massiv[i]>1000) {massMore1000=true;} 	
		}
		System.out.println("summa of massiv "+ SumMas);
		if (massMore1000==true) {System.out.println("Массив Массивный!");}		
	}
}