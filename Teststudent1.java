//initializing obj through reference

class Student
{
int id;
String name;
}
class Teststudent1
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.id=20;
s1.name="Seetha";
s2.id=56;
s2.name="Rukmini";
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+" "+s2.name);
}
}