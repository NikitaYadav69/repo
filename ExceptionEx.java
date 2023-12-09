class ExceptionEx
{
public static void main(String args[])
{
try{
int a=10,b=0;
double c=a/b;
System.out.println("Division is "+c);
}
catch(Exception e)
{
System.out.println("Denominator should not be zero");
}
}
}