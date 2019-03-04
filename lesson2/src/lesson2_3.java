public class lesson2_3
{
	public static void main(String[] args)
	{
		int Massiv[]={1,2,3,100500,1050,6,7,1001};
		int maxEllement=Massiv[1];
		for (int i=1; i<8;i++)
		{
			if(Massiv[i]==100500) {continue;} 
			else if (Massiv[i]>maxEllement) { maxEllement=Massiv[i];}
		}
		System.out.println("Максимальный элемент массива = " + maxEllement);
	}
}