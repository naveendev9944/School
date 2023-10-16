import java.util.*;
public class Testmain {
    public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Schools ob=new Schools();
   	boolean loop = true;
    	while (loop)
      	   {
		System.out.println("1.Add Teacher \n2.Add student \n3.Print Profit \n4.Show teachers\n5.Show students\n6.Add School\n7.Show Schools\n8. Exit");
		byte choice = sc.nextByte();
		sc.nextLine();
		switch (choice){
	  		case 1:{
	  			System.out.println ("Enter the School Name:");
	     		        String sname=sc.nextLine();
	     		        School obj=ob.getSchool(sname);
	     		        if(obj==null){
	     		        	System.out.println("School not found");
	     		        	break;
	     		        }
	     		        System.out.println ("Enter the Teacher Name:");
	     		        String name=sc.nextLine();
	     		        System.out.println ("Enter Address line1:");
	     		        String l1=sc.nextLine();
	     		        System.out.println ("Enter Address line2:");
	     		        String l2=sc.nextLine();
	     		        System.out.println ("Enter the age:");
	     		        byte age=sc.nextByte();
	     		        System.out.println ("Enter the monthly salary:");
	     		        int salary=sc.nextInt();
	     		        sc.nextLine();
	     		        System.out.println ("Enter the gender:\n1.Male\n2.Female");
	     		        byte gender=sc.nextByte();
	     		        Address address=new Address(l1,l2);
	     		        Teacher teacher=new Teacher(name,address,age,gender,salary);
	     		        obj.addTeacher(teacher);
	     			break;
	   		 }
	 		 case 2:{
	 		 	System.out.println ("Enter the School Name:");
	     		        String sname=sc.nextLine();
	     		        School obj=ob.getSchool(sname);
	     		        if(obj==null){
	     		        	System.out.println("School not found");
	     		        	break;
	     		        }
	 		 	System.out.println ("Enter the student Name:");
	     		        String name=sc.nextLine();
	     		        System.out.println ("Enter Address line1:");
	     		        String l1=sc.nextLine();
	     		        System.out.println ("Enter Address line2:");
	     		        String l2=sc.nextLine();
	     		        System.out.println ("Enter the age:");
	     		        byte age=sc.nextByte();
	     		        System.out.println ("Enter the monthly fees:");
	     		        int fee=sc.nextInt();
	     		        sc.nextLine();
	     		        System.out.println ("Enter the gender:\n1.Male\n2.Female");
	     		        byte gender=sc.nextByte();
	     		        Address address=new Address(l1,l2);
	     		        Student student=new Student(name,address,age,gender,fee);
	     		        obj.addStudent(student);
	     			break;
	    		}

	  		case 3:{
	  			System.out.println ("Enter the School Name:");
	     		        String sname=sc.nextLine();
	     		        School obj=ob.getSchool(sname);
	     		        if(obj==null){
	     		        	System.out.println("School not found");
	     		        	break;
	     		        }
	      			System.out.println("Monthly profit is"+obj.calculateMonthlyProfit());
	      			break;
	    		}
	    		case 4:{
	    			System.out.println ("Enter the School Name:");
	     		        String sname=sc.nextLine();
	     		        School obj=ob.getSchool(sname);
	     		        if(obj==null){
	     		        	System.out.println("School not found");
	     		        	break;
	     		        }
	      			obj.showTeacher();
	      			break;
	    		}
	    		case 5:{
	    			System.out.println ("Enter the School Name:");
	     		        String sname=sc.nextLine();
	     		        School obj=ob.getSchool(sname);
	     		        if(obj==null){
	     		        	System.out.println("School not found");
	     		        	break;
	     		        }
	      			obj.showStudent();
	      			break;
	    		}
	    		case 6:{
	    			System.out.println ("Enter the School Name:");
	     		        String sname=sc.nextLine();
	     		        System.out.println ("Enter Address :");
	     		        String ad=sc.nextLine();
	     		        School obj=new School(sname,ad);
	     		        ob.addSchool(obj);
	     		        break;
	    		}
	    		case 7:{
	    			ob.showSchool();
	    			break;
	    		}
	  		case 8:{
	      			loop=false;
	 		 }
      	   }
       }
    }
}
