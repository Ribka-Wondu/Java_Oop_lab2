package Lab;

import java.sql.SQLOutput;

public class Student {
   final int age;
    static String fullname="ABEBE";
    String martialstatus="Single";
    int salary;
   static int joblevel;
    double salalry;
    static int month=30;
    static double salaryperday=200.50;

    Student(String fullname,int age) {
        this.fullname=fullname;
        this.age = age;
        this.martialstatus= martialstatus ;
        System.out.println("Name: "+ this.fullname);
        System.out.println("your martial status is:  " + this.martialstatus);
    }
    public static void calcusalary() {
        double salary =salaryperday* month;
        System.out.println("your salary is: "+ salary);
    }
    public static void Job(int salary) {
        System.out.println(" the highest salary in this job is: "+ 20000);
    }
    public static void Job(int salary,int level) {
        System.out.println("the highest salary in this job is: "+ 1000 + "for level zero experience" );
    }

    public static void main(String[] args){
        Student obj=new Student("ABEBE",32);
        System.out.println("Age: "+ obj.age);
        calcusalary();
        Job(20000);
        Job(1000,0);


    }
}
