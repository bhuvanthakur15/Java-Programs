import java.util.Scanner;

class binry
{
public static void main(String args[])
{
Scanner in= new Scanner (System.in);
System.out.print("Enter the number = ");
int no= in.nextInt();
int rem;
String x= " ";
while(no>0)
{
 	    rem = no % 2;
            x = rem + x;
            no = no / 2;
}
System.out.println("It's binary representation is= " +x);
}
} 