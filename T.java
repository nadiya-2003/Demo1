// input is vowel or not 
import java.util.Scanner;
class T
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
System.out.println("YES");
else
System.out.println("NO");
}
}













