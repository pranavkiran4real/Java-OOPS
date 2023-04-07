import newp.converter;
import java.util.Scanner;
class mainpack
{
	public static void main(String args[])
	{
		int amount;
		int choice;
		int choice2;
		Scanner sc=new Scanner(System.in);
		converter obj=new converter();
		System.out.println("1.Currency converter");
		System.out.println("2.Distance converter");
		System.out.println("3.Time converter");
		System.out.print("Enter you choice: ");
		choice=sc.nextInt();
		if(choice == 1)
		{
			System.out.println("1.Dollar to INR");
			System.out.println("2.EURO to INR");
			System.out.println("3.Yen to INR");
			System.out.println("4.INR to Dollar");
			System.out.println("5.INR to EURO");
			System.out.println("6.INR to Yen");
			System.out.print("Enter you choice: ");
			choice2=sc.nextInt();
			if(choice2 == 1)
			{
				System.out.print("Enter Dollar: ");
				amount=sc.nextInt();
				System.out.print("INR for given dollar is : "+obj.dollar2inr(amount));
			}
			else if(choice2 == 2)
			{
				System.out.print("Enter EURO: ");
				amount=sc.nextInt();
				System.out.print("INR for given EURO is : "+obj.euro2inr(amount));
			}
			else if(choice2 == 3)
			{
				System.out.print("Enter Yen: ");
				amount=sc.nextInt();
				System.out.print("INR for given Yen is : "+obj.yen2inr(amount));
			}
			else if(choice2 == 4)
			{
				System.out.print("Enter INR: ");
				amount=sc.nextInt();
				System.out.print("Dollar for given INR is : "+obj.inr2dollar(amount));
			}
			else if(choice2 == 5)
			{
				System.out.print("Enter INR: ");
				amount=sc.nextInt();
				System.out.print("EURO for given INR is : "+obj.inr2euro(amount));
			}
			else if(choice2 == 6)
			{
				System.out.print("Enter INR: ");
				amount=sc.nextInt();
				System.out.print("Yen for given INR is : "+obj.inr2yen(amount));
			}
		}
		else if(choice == 2)
		{
			System.out.println("1.meter to KM");
			System.out.println("2.miles to KM");
			System.out.println("3.KM to meter");
			System.out.println("4.KM to miles");
			System.out.print("Enter you choice: ");
			choice2=sc.nextInt();
			if(choice2 == 1)
			{
				System.out.print("Enter meter: ");
				amount=sc.nextInt();
				System.out.print("KM for given meter is :"+obj.meter2km(amount));
			}
			else if(choice2 == 2)
			{
				System.out.print("Enter miles: ");
				amount=sc.nextInt();
				System.out.print("KM for given miles is : "+obj.miles2km(amount));
			}
			else if(choice2 == 3)
			{
				System.out.print("Enter KM: ");
				amount=sc.nextInt();
				System.out.print("meter for given KM is :"+obj.km2meter(amount));
			}
			else if(choice2 == 4)
			{
				System.out.print("Enter KM: ");
				amount=sc.nextInt();
				System.out.print("miles for given KM is : "+obj.km2miles(amount));
			}
		}
		else if(choice == 3)
		{
			System.out.println("1.hours to minutes");
			System.out.println("2.hours to seconds");
			System.out.println("3.minutes to hours");
			System.out.println("4.seconds to hours");
			System.out.print("Enter you choice: ");
			choice2=sc.nextInt();
			if(choice2 == 1)
			{
				System.out.print("Enter hours: ");
				amount=sc.nextInt();
				System.out.print("minutes for given hours "+obj.hrs2min(amount));
			}
			else if(choice2 == 2)
			{
				System.out.print("Enter hours: ");
				amount=sc.nextInt();
				System.out.print("seconds for given hours "+obj.hrs2min(amount));
			}
			else if(choice2 == 3)
			{
				System.out.print("Enter minutes: ");
				amount=sc.nextInt();
				System.out.print("hours for given minutes "+obj.min2hrs(amount));
			}
			else if(choice2 == 4)
			{
				System.out.print("Enter seconds: ");
				amount=sc.nextInt();
				System.out.print("hours for given seconds "+obj.sec2hrs(amount));
			}
		}
	}
}
