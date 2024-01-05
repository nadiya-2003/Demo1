//initialising the obj through method
class Employe
{
int rollno;
String name;
String dept;
void insertRecord(int n,String r,String p)
{
rollno=n;
name=r;
dept=p;
}
void display()
{
System.out.println(rollno+"  "+name+"  "+dept);
}
}
class Testemploye
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
s1.insertRecord(2003,"Lokesh","HOD");
s2.insertRecord(3980,"Shivkumar","Assoc.prof");
s3.insertRecord(3520,"Thushara Bharathi","Assoc.prof");
s1.display();
s2.display();
s3.display();
}
}

