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
Employe e1=new Employe();
Employe e2=new Employe();
Employe e3=new Employe();
e1.insertRecord(2003,"Lokesh","HOD");
e2.insertRecord(3980,"Shivkumar","Assoc.prof");
e3.insertRecord(3520,"Thushara Bharathi","Assoc.prof");
e1.display();
e2.display();
e3.display();
}
}

