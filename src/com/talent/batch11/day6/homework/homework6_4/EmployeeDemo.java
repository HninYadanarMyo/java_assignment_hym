package com.talent.batch11.day6.homework.homework6_4;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new HourlyEmployee("John", 1, 4000, 8);
        Employee e2 = new HourlyEmployee("Mary", 2, 4000, 48);
        Employee e3 = new SalariedEmployee("David", 3, 4800000);

        System.out.println("Hourly Employee(8 hours): "+e1);
        System.out.println();
        System.out.println("Hourly Employee(48 hours): "+e2);
        System.out.println();
        System.out.println("Salary Employee: "+e3);
    }
}
