import java.util.*;
public class switchcase
{
public static void main(String[] args)
{
Scanner sc;
sc=new Scanner(System.in);
int a;
System.out.println("Main Menu");
System.out.println("1.A\n2.B\n3.C\n");
System.out.println("Enter the choice");
a=sc.nextInt();
switch(a)
{
case 1:System.out.println("Selected A");
	break;
case 2:System.out.println("Selected B");
	break;
case 3:System.out.println("Selected C");
	break;
default:System.out.println("Wrong Option!");
}
}
}