import java.util.*;

class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
enum Gender{
	Male,
	Female
	};
class Person {
    String name;
    Address address;
    byte age;
    Gender gender;
    public Person(String name, Address address, byte age, byte gen) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender =Gender.values()[gen-1];
    }
}

class Teacher extends Person {
    private byte leavedays;
    private int salary;
    public Teacher(String name, Address address, byte age, byte gender,int salary) {
        super(name, address, age, gender);
        this.leavedays = 0;
        this.salary=salary;
    }

    public int getMonthlySalary() {
       
        return this.salary;
    }

    public byte noOfLeaveDays() {
	this.leavedays=(byte) ((Math.random() * (5 - 0)) +0);
        return this.leavedays;
    }
    public void printTeacher(){
        System.out.println("\nTeacher name : "+this.name+"\nAge : "+this.age+"\nGender : "+this.gender+"\nNo of leave days : "+this.leavedays);
    }
}

class Student extends Person {
    private byte latedays;
    private int fees;
    public Student(String name, Address address, byte age, byte gender,int fees) {
        super(name, address, age, gender);
        this.latedays = 0;
        this.fees=fees;
    }


    public byte getNumberOfLateDays() {
    	this.latedays=(byte) ((Math.random() * (20 - 0)) +0);
        return this.latedays;
    }

    public int getMonthlyFee() {
    	
        return this.fees;
    }
    public void printStudent(){
        System.out.println("\nstudent name : "+this.name+"\nAge : "+this.age+"\nGender : "+this.gender+"\nNo of late days : "+this.latedays);
    }
}

class School {
    String name;
    String address;
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    public School(String name, String add) {
        this.name = name;
        this.address= address;
    }
    public  void showTeacher() {
        for (Teacher teacher : this.teachers) {
            teacher.printTeacher();
        }
    }
    public void showStudent() {
        for (Student student : this.students) 
            student.printStudent();
    }
    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
        System.out.println(teacher.name+" added succesfully");
    }

    public void addStudent(Student student) {
        this.students.add(student);
        System.out.println(student.name+" added succesfully");
    }
    public void printSchool(){
        System.out.println("\nschool name : "+this.name+"\nAddress : "+this.address);
    }
    public float calculateMonthlyProfit() {
        float totalFeeCollected = 0;
        float totalSalaryPaid = 0;

        for (Teacher teacher : this.teachers) {
            totalSalaryPaid += teacher.getMonthlySalary() - (teacher.noOfLeaveDays() * (teacher.getMonthlySalary() / 30));
        }

        for (Student student : this.students) {
            totalFeeCollected += student.getMonthlyFee() + (student.getNumberOfLateDays() * 5);
        }

        return totalFeeCollected - totalSalaryPaid;
    }
}

class Schools{
    
    private static ArrayList<School> schools= new ArrayList<>();
   
    public static void showSchool() {
        for (School school : schools) 
            school.printSchool();
    }
    public static void addSchool(School school) {
        schools.add(school);
        System.out.println("School added succesfully");
    }

   

    public static School getSchool(String name) {
        
        for (School school : schools) {
            if(name.equals(school.name))
            	return school;
        }

        return null;
    }
}

