//calculating area of circle
class Circle
{
int radius;
void set(int x)
{
radius=x;
}
void display()
{
System.out.println("Area of circle is:"+3.14*radius*radius);
System.out.println("perimeter of circle is:"+2*3.14*radius);
}
}
class Area1
{
public static void main(String args[])
{
Circle c=new Circle ();
Circle  s=new Circle ();
c.set(5);
s.set(10);
c.display();
s.display();
}
}