import java.util.Scanner;

class grtrThanAvg
{
public static void main(String args[])
{
Scanner in =new Scanner (System.in);
System.out.print("\nEnter the size of the array= ");
int n = in.nextInt();
int a[]= new int[n];
System.out.print("Enter the elements in the array= ");
int i;
for(i=0;i<n;i++)
{
	a[i] = in.nextInt();
}  
int sum=0;
for(i=0;i<n;i++)
{
	sum = sum+a[i];
}
float avg;
avg=(float)sum/n;

System.out.println("\nThe average of the numbers is= "+avg);

System.out.println("\nThe numbers in the list greater than the average are= ");
for(i=0;i<n;i++)
{
	if (a[i]>avg)
	{
	System.out.print(" "+a[i]);
	}
}

}
}