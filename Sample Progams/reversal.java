import java.util.*;
public class reversal
{
public static void main(String args[])
{
Scanner sc;
sc=new Scanner(System.in);
int rev=0,num;
System.out.println("Enter the Number:");
num=sc.nextInt();
while(num!=0)
{
rev=(rev*10)+(num%10);
num=num/10;
}
System.out.println("Reversed Number is :"+(rev));
}
}
