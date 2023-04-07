import java.util.*;
import java.lang.*;
import java.io.*;
public class myclass
{
int roll;
String name;
float marks;
public static void display(int r,String n,float m)
{
System.out.println("Roll.no :"+r);
System.out.println("Name :"+n);
System.out.println("Marks :"+m);
}
public static void main(String args[])
{
Scanner sc;
sc=new Scanner(System.in);
int no;
String nm;
float mr;
myclass cl=new myclass();
System.out.println("Enter the Roll.no :");
no=sc.nextInt();
System.out.println("Enter the Name :");
nm=sc.next();
System.out.println("Enter the Marks :");
mr=sc.nextFloat();
cl.display(no,nm,mr);
}
}


