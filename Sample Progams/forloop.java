import java.util.*;
public class forloop
{
public static void main(String args[])
{
Scanner sc;
sc=new Scanner(System.in);
int n,i;
System.out.println("Enter the frequency of the loop");
n=sc.nextInt();
for(i=0;i<n;i++)
{
System.out.println("Hey you!"+(i+1));
}
}
}
