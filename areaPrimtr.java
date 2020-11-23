import java.util.Scanner;

class areaPrimtr
{
public static void main(String agrs[])
{
Scanner in=new Scanner(System.in);
System.out.print("To find the area and perimeter of a particular shape enter the required choice= \n");
System.out.print("1. Triangle\n2.Rectangle\n3.Square\n4.Rhombus\n");
int choice=in.nextInt();
switch(choice)
{
case 1:{
float h,base,a,b,c;
System.out.print("Enter the base and height of the triangle= ");
h=in.nextFloat(); base=in.nextFloat();
double area=0.5*h*base;
System.out.print("The area of the triangle is = "+area);
System.out.print("\nEnter the three sides of the triangle= ");
a=in.nextFloat(); b=in.nextFloat();c=in.nextFloat();
float peri= a+b+c ;
System.out.print("The perimeter of the triangle is = "+peri);
break;
}

case 2:{
float l,b;
System.out.print("Enter the length and breadth of the rectangle=");
l=in.nextFloat(); b=in.nextFloat();
float area=l*b ;
System.out.print("The area of the rectangle is = "+area);
float peri= 2*(l+b);
System.out.print("\nThe perimeter of the rectangle is = "+peri);
break;
}


case 3:{
float a;
System.out.print("Enter the side of the square=");
a=in.nextFloat();
float area=a*a ;
System.out.print("The area of the square is = "+area);
float peri= 4*a;
System.out.print("\nThe perimeter of the square is = "+peri);
break;
}


case 4:{
float h,b;
System.out.print("Enter the base and height of the Rhombus=");
b=in.nextFloat(); h=in.nextFloat();
float area=b*h ;
System.out.print("The area of the rectangle is = "+area);
System.out.print("\nEnter the side of the Rhombus=");
float side= in.nextFloat();
float peri= 4*side;
System.out.print("\nThe perimeter of the rectangle is = "+peri);
break;
}

default:
{
System.out.print("Please enter the correct option(b/w 1 to 4).");
break;
}
}
}
}