import java.util.*;
import java.util.ArrayList;
class Lst
{
    Scanner sc =new Scanner(System.in);;
    String str;
    public void append(ArrayList<String> AL)
    {
        char ans;
        do
        {
            System.out.println("Enter string: ");
            str=sc.next();
            AL.add(str);
            System.out.println("Do you want to append more string: ");
            ans=sc.next().charAt(0);
        }while(ans=='y');
        System.out.println("The array elements are... "+AL);
        System.out.println("The array size is... "+AL.size());
    }
    public void insert(ArrayList<String> AL)
    {
        System.out.println("Enter string: ");
        str=sc.next();
        System.out.println("Enter index at which the string is to be inserted: ");
        int index=sc.nextInt();
        AL.add(index,str);
        System.out.println("The array elements are... "+AL);
    }
    public void search(ArrayList<String> AL)
    {
        String searchStr;
        System.out.println("Enter string for searching ");
        searchStr=sc.next();
        boolean found = false;
        Iterator<String> iter = AL.iterator();
        String curItem="";
        int pos=0;
        while ( iter.hasNext() == true )
        {
            pos=pos+1;
            curItem =(String) iter.next();
            if (curItem.equals(searchStr))
            {
                found = true;
                break;
            }
        }
        if ( found == false )
        {
            pos=0;
        }
        if (pos!=0)
        {
            System.out.println(searchStr + " String Found in position : " + pos);
        }
        else
        {
            System.out.println(searchStr + " String not found");
        }
    }
    public void find(ArrayList<String> AL)
    {
        Object [] objs = AL.toArray(new String[0]); 
        String[] str_list=new String[objs.length];
        System.arraycopy(objs,0,str_list,0,objs.length);  
        System.out.println("Enter starting letter: ");
        String searchChar=sc.next();
        System.out.println("The strings starting with letter "+searchChar+" are...");
        for(int i=0;i<str_list.length;i++)                 
        {
            if(str_list[i].startsWith(searchChar))          
                System.out.println(str_list[i]);              
        }
    }
}
class ArrayListExp_5
{
    public static void main(String[] args)
    {
        System.out.println("\n\t\t Program for Implementing Array List for List of Strings");
        ArrayList<String> AL=new ArrayList<>(); 
        Lst obj=new Lst();
        char ans;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Main Menu");
            System.out.println("1. Append \n2. Insert at particular Index \n3. Search \n4. Liststrings \n5. Exit");
            System.out.print("\nEnter your choice:");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:obj.append(AL); break;
                case 2:obj.insert(AL); break;
                case 3:obj.search(AL); break;
                case 4:obj.find(AL); break;
                case 5:System.exit(1);
            }
            System.out.println("Do you want to go to Main Menu?(y/n): ");
            ans=sc.next().charAt(0);
            System.out.print("\n");
        }while(ans=='y');
        sc.close();
    }
}
