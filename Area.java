//calculating area of rectangle
class Rectangle
{
int length;
int breadth;
void set(int x,int y)
{
length=x;
breadth=y;
}
void display()
{
System.out.println("Area is:"+length*breadth);
}
}
class Area
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
Rectangle s=new Rectangle();
r.set(5,10);
s.set(10,20);
r.display();
s.display();
}
}