import java.util.*;
class Asearch
{
	public static void main(String args[])
	{
		int a[]=new int[10],i,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 10 elements: ");
		for(i=0;i<5;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("you entered the following elements: ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter the element you want to search: ");
		b=obj.nextInt();
		for(i=0;i<5;i++)
		{
			if(a[i]==b)
			{
				System.out.println("Your no. is present in the array" + i);
				break;
			}
			else
			{
				System.out.println("No. is not present");
				break;
			}
		}
	}
}