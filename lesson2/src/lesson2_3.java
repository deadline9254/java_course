public class lesson2_3
{
	public static void main(String[] args)
	{
		int Massiv[]={100500,2,3,100500,1050,6,7,1001};
		int maxEllement=Massiv[1];
		for (int i=0; i<8;i++)
		{
			if(Massiv[i]==100500) {continue;}
			else if(maxEllement==100500) {maxEllement=0;} 
			else if (Massiv[i]>maxEllement) { maxEllement=Massiv[i];}
		}
		System.out.println("Максимальный элемент массива = " + maxEllement);
	}
}