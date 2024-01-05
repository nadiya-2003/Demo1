//initialising the obj through method

class Student
{
int rollno;
String name;
void insertRecord(int n,String r)
{
rollno=n;
name=r;
}
void display()
{
System.out.println(rollno+"  "+name);
}
}
class T3
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.insertRecord(2003,"ram");
s2.insertRecord(3980,"seetha");
s1.display();
s2.display();
}
}


