package com.talent.batch11.day6.homework.homework6_1;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name,int age,String subject){
        super(name,age);
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(){
        this.subject = subject;
    }
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + getName() +
                ". I am " + getAge() +
                " years old and I teach " + subject + ".");
    }
    @Override
    public String getRole(){
        return "Teacher";
    }
}
