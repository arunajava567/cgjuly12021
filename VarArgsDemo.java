//Var Args Demo

package utility;

public class VarArgsDemo
{     
	static int sum(String name,int... n)
	{
		int sum=0;
	
		for(int i=0;i<n.length;i++)
			sum = sum + n[i];

		return sum;	
	}
	public static void main(String[] args)
	{
		System.out.println(sum("A",10,20,30));

		System.out.println(sum("A123",10,20,30,40,50));
		
		System.out.println(sum("a234",10,20,23,3,4,5,6,7,7,8,6,5,4));
	}
}