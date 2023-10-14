import java.util.*;

class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

class Person {
    String name;
    Address address;
    int age;
    String gender;

    public Person(String name, Address address, int age, String gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }
}

class Teacher extends Person {
    private int leavedays;
    private double salary;
    public Teacher(String name, Address address, int age, String gender,double salary) {
        super(name, address, age, gender);
        this.leavedays = 0;
        this.salary=salary;
    }

    public double getMonthlySalary() {
       
        return this.salary;
    }

    public int noOfLeaveDays() {
    	System.out.println ("Enter the no of leave days:");
    	Scanner sc = new Scanner (System.in);
   	this.leavedays=sc.nextInt();
        return this.leavedays;
    }
    public void printTeacher(){
        System.out.println("\nTeacher name : "+this.name+"\nAge : "+this.age+"\nGender : "+this.gender+"\nNo of leave days : "+this.leavedays);
    }
}

class Student extends Person {
    private int latedays;
    private double fees;
    public Student(String name, Address address, int age, String gender,double fees) {
        super(name, address, age, gender);
        this.latedays = 0;
        this.fees=fees;
    }


    public int getNumberOfLateDays() {
    	System.out.println ("Enter the no of late days:");
    	Scanner sc = new Scanner (System.in);
   	this.latedays=sc.nextInt();
        return this.latedays;
    }

    public double getMonthlyFee() {
    	
        return this.fees;
    }
    public void printStudent(){
        System.out.println("\nstudent name : "+this.name+"\nAge : "+this.age+"\nGender : "+this.gender+"\nNo of late days : "+this.latedays);
    }
}

class School {
    private static ArrayList<Teacher> teachers = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();
    public static void showTeacher() {
        for (Teacher teacher : teachers) {
            teacher.printTeacher();
        }
    }
    public static void showStudent() {
        for (Student student : students) 
            student.printStudent();
    }
    public static void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println(teacher.name+"added succesfully");
    }

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static double calculateMonthlyProfit() {
        double totalFeeCollected = 0.0;
        double totalSalaryPaid = 0.0;

        for (Teacher teacher : teachers) {
            totalSalaryPaid += teacher.getMonthlySalary() - (teacher.noOfLeaveDays() * (teacher.getMonthlySalary() / 30));
        }

        for (Student student : students) {
            totalFeeCollected += student.getMonthlyFee() + (student.getNumberOfLateDays() * 5);
        }

        return totalFeeCollected - totalSalaryPaid;
    }
}

