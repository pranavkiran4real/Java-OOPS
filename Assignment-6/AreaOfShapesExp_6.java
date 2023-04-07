import java.util.*;
abstract class Shapes
{
    double a,b;
    abstract void printArea();
}
class Rectangle extends Shapes
{
    Scanner input=new Scanner(System.in);
    void printArea()
    {
        System.out.println("Calculating Area of Rectangle");
        System.out.print("Enter length: ");
        a=input.nextDouble();
        System.out.print("Enter breadth: ");
        b=input.nextDouble();
        double area=a*b;
        System.out.println("Area of Rectangle: "+area);
    }
}
class Triangle extends Shapes
{
    Scanner input=new Scanner(System.in);
    void printArea()
    {
        System.out.println("Calculating Area of Triangle");
        System.out.print("Enter height: ");
        a=input.nextDouble();
        System.out.print("Enter breadth: ");
        b=input.nextDouble();
        double area=0.5*a*b;
        System.out.println("Area of Triangle: "+area);
    }
}
class Circle extends Shapes
{
    Scanner input=new Scanner(System.in);
    void printArea()
    {
        System.out.println("Calculating Area of Circle");
        System.out.print("Enter radius: ");
        a=input.nextDouble();
        double area=3.14*a*a;
        System.out.println("Area of Circle: "+area);
    }
}
class AreaOfShapesExp_6
{
    public static void main(String[] args)
    {
        Shapes obj;
        char ans;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Main Menu");
            System.out.println("1. Area of Rectangle \n2. Area of Triangle \n3. Area of Circle \n4. Exit");
            System.out.print("\nEnter your choice:");
            int choice=sc.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:obj=new Rectangle(); obj.printArea(); break;
                case 2:obj=new Triangle(); obj.printArea(); break;
                case 3:obj=new Circle(); obj.printArea(); break;
                case 4:System.out.println("Exiting...."); System.exit(1);
            }
            System.out.println("\nDo you want to go to Main Menu?(y/n): ");
            ans=sc.next().charAt(0);
            System.out.print("\n");
        }while(ans=='y');
        sc.close();
    }
}
