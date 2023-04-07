import java.util.*;
class employee {
	String name, address, mail, number;
	double id, bpay, da, hra, pf, cfund, gross, net;
   	Scanner s = new Scanner(System.in);
    	void input(){
        		System.out.println("enter the employee name:");
        		name = s.next();
		System.out.println("enter the employee id:");
	        	id = s.nextDouble();
        		System.out.println("enter the employee address:");
        		address = s.next();
        		System.out.println("enter the employee mail:");
        		mail = s.next();
        		System.out.println("enter the employee number:");
        		number = s.next();
       		System.out.println("enter the basic pay:");
        		bpay = s.nextDouble();
    	}
    	void calc() {
        		da = bpay * (0.97);
       	 	hra = bpay * (0.10);
        		pf = bpay * (0.12);
        		cfund = bpay * (0.001);
        		gross = (bpay + da + hra);
        		net = (gross - pf - cfund);
    	}
    	void display() {
       		System.out.println("**PAY SLIP**");
        		System.out.println("employee name: " + name);
        		System.out.println("employee id: " + id);
        		System.out.println("employee address: " + address);
        		System.out.println("employee mail: " + mail);
        		System.out.println("employee mobile number: " + number);
        		System.out.println("basic pay: " + bpay);
        		System.out.println("DA: " + da);
        		System.out.println("HRA: " + hra);
        		System.out.println("PF: " + pf);
        		System.out.println("club fund: " + cfund);
        		System.out.println("Gross salary: " + gross);
        		System.out.println("Net salary: " + net);
    	}
}
class programmer extends employee{
    void prog(){
        System.out.println("CATEGORY:Programmer");
    }
}
class assistant_professor extends employee{
    void assist(){
        System.out.println("CATEGORY:Assistant Professor");
    }
}
class associate_professor extends employee {
    void assp() {
        System.out.println("CATEGORY:Associate Professor");
    }
}
class professor extends employee {
    void prof() {
        System.out.println("CATEGORY:Professor");
    }
}
public class paybill {
    public static void main(String args[]) {
    	int choice;
        	Scanner x = new Scanner(System.in);
        	do{
            		System.out.println("enter the designation of the employee:");
            		System.out.println("1.Programmer\n2.Assistant Professor\n3.Associate Professor\n4.Professor\n5.Exit");
            		choice = x.nextInt();
            		switch (choice) {
                		case 1: {
                    		programmer p = new programmer();
                    		p.prog();
                    		p.input();
                    		p.calc();
                    		p.display();
                    		break;
                		}
                		case 2: {
                    		assistant_professor a = new assistant_professor();
                    		a.assist();
                    		a.input();
                    		a.calc();
                    		a.display();
                    		break;
                		}
                		case 3: {
                    		associate_professor ap = new associate_professor();
                    		ap.assp();
                    		ap.input();
                    		ap.calc();
                    		ap.display();
                    		break;
                		}
                		case 4: {
                    		professor pf = new professor();
                    		pf.prof();
                    		pf.input();
                    		pf.calc();
                    		pf.display();
                    		break;
                		}
            	}
        } while (choice != 5);
    }
}
