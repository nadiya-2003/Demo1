import java.util.Scanner;
class Demo
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i=scob.nextInt();
int j=scob.nextInt();
if(j==0)
{
System.out.println("Division by zero error");
}
else
{
System.out.println(i+"division by "+j+" is" +(i/j));
i=i+j;
}
}
}
