import java.util.*;
public class Testmain {
    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	School obj=new School();
   	boolean loop = true;
    	while (loop)
      	   {
		System.out.println("1. Add Teacher \n2.Add student \n3.Print Profit \n4.Show teachers\n5.Show students\n6. Exit");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice){
	  		case 1:{
	     		        System.out.println ("Enter the Teacher Name:");
	     		        String name=sc.nextLine();
	     		        System.out.println ("Enter Address line1:");
	     		        String l1=sc.nextLine();
	     		        System.out.println ("Enter Address line2:");
	     		        String l2=sc.nextLine();
	     		        System.out.println ("Enter the age:");
	     		        int age=sc.nextInt();
	     		        System.out.println ("Enter the monthly salary:");
	     		        double salary=sc.nextDouble();
	     		        sc.nextLine();
	     		        System.out.println ("Enter the gender:");
	     		        String gender=sc.nextLine();
	     		        Address address=new Address(l1,l2);
	     		        Teacher teacher=new Teacher(name,address,age,gender,salary);
	     		        obj.addTeacher(teacher);
	     			break;
	   		 }
	 		 case 2:{
	 		 	System.out.println ("Enter the student Name:");
	     		        String name=sc.nextLine();
	     		        System.out.println ("Enter Address line1:");
	     		        String l1=sc.nextLine();
	     		        System.out.println ("Enter Address line2:");
	     		        String l2=sc.nextLine();
	     		        System.out.println ("Enter the age:");
	     		        int age=sc.nextInt();
	     		        System.out.println ("Enter the monthly fees:");
	     		        double fees=sc.nextDouble();
	     		        sc.nextLine();
	     		        System.out.println ("Enter the gender:");
	     		        String gender=sc.nextLine();
	     		        Address address=new Address(l1,l2);
	     		        Student student=new Student(name,address,age,gender,fees);
	     		        obj.addStudent(student);
	     			break;
	    		}

	  		case 3:{
	      			System.out.println("Monthly profit is"+obj.calculateMonthlyProfit());
	      			break;
	    		}
	    	case 4:{
	      			obj.showTeacher();
	      			break;
	    		}
	    	case 5:{
	      			obj.showStudent();
	      			break;
	    		}
	  		case 6:{
	      			loop=false;
	 		 }
      	   }
       }
    }
}
