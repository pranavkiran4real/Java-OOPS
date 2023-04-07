import java.util.*;
public class Exercise_1 	
{
    int con_no, prev, current, reading;
    String con_name, type_eb;
    double bill;
    
    void input() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter consumer number : ");
        con_no = sc.nextInt();
        System.out.println("Enter consumer name: ");
        con_name = sc.next();
        System.out.println("Enter previous month reading : ");
        prev = sc.nextInt();
        System.out.println("Enter current month reading: ");
        current = sc.nextInt();
        System.out.println("Enter the type of connection(domestic/commercial): ");
        type_eb = sc.next();
        
        reading = current - prev;
    }
    
    double calculate() 
    {
        if (type_eb.equals("domestic")) 
        {
            if (reading >= 0 && reading <= 100) 
            {
                bill = reading * 1;
            } 
            else if (reading > 100 && reading <= 200) 
            {
                bill = (100 * 1) + ((reading - 100) * 2.50);
            } 
            else if (reading > 200 && reading <= 500) 
            {
                bill = (100 * 1) + (200 * 2.50) + ((reading - 200) * 4);
            } 
            else if (reading > 500) 
            {
               bill = (100 * 1) + (100 * 2.50) + (300 * 4) + ((reading - 500) *6);
            }
        } 
        else if (type_eb.equals("commercial")) 
        {
            if (reading >= 0 && reading <= 100) 
            {
                bill = reading * 2;
            } 
            else if (reading > 100 && reading <= 200) 
            {
                bill = (100 * 2) + ((reading - 100) * 4.50);
            } 
            else if (reading > 200 && reading <= 500) 
            {
                bill = (100 * 2) + (200 * 4.50) + ((reading - 200) * 6);
            } 
            else if (reading > 500) 
            {
               bill = (100 * 2) + (100 * 4.50) + (300 * 6) + ((reading - 500) *7);
            }
        }
        return bill;
    }

    void display() 
    {
        System.out.println("----------ELECTRICITY BILL----------");
        System.out.println("Consumer Number : " + con_no);
        System.out.println("Consumer Name : " + con_name);
        System.out.println("Previous month readings : " + prev);
        System.out.println("Current month readings : " + current);
        System.out.println("Type of EB Connection : " + type_eb);
        System.out.println("Total Amount : Rs." + bill);
    }
    
	public static void main(String[] args) 
	{
		Exercise_1 obj = new Exercise_1();
        obj.input();
        obj.calculate();
        obj.display();
	}
}
