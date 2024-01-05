import java.util.Scanner;
class T2
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);
if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
{
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
System.out.println("yes it is a alphabet and not a consonant");
}
else
{
    System.out.println("No,it is not a alphabet");
}

if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
 {
    System.out.println("NO its not a consonant");
 }

else
 {
    System.out.println("YES,it is a consonant");
 }


}
}