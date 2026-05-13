package com.talent.batch11.day6.homework.homework6_1;

public class Student extends Person {
    private int gradeLevel ;

    public Student(String name,int age,int gradeLevel){
        super(name,age);
        this.gradeLevel = gradeLevel;
    }
    public int getGradeLevel(){
        return gradeLevel;
    }
    public void setGradeLevel(int gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + getName() +
                ". I am " + getAge() +
                " years old and I am in Grade " + gradeLevel + ".");
    }
    @Override
    public String getRole(){
        return "Student";
    }
}
