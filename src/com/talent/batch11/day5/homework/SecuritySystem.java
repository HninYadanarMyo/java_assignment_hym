package com.talent.batch11.day5.homework;

public class SecuritySystem {
    private String secretCode;
    public final String serialNumber;

    public SecuritySystem(String secretCode,String serialNumber){
        this.secretCode = secretCode;
        this.serialNumber = serialNumber;
    }
    public void displaySerial(){
        System.out.println("Secret Number is :"+secretCode);
        System.out.println("Serial Number is : "+serialNumber);
    }

    public static void main(String[] args) {
        SecuritySystem sys = new SecuritySystem("123","456");
//        sys.secretCode = "789";
//        sys.serialNumber="New123";
        sys.displaySerial();
    }
}
