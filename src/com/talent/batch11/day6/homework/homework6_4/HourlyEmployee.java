package com.talent.batch11.day6.homework.homework6_4;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hourWorked;

    public HourlyEmployee(String name, int id,double hourlyRate,int hourWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hourWorked = hourWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        if (hourWorked >= 0)
            this.hourWorked = hourWorked;
    }

    @Override
    public double calculatePay() {
        double regularPay;
        double overtimePay = 0;

        if (hourWorked > 40) {
            int overtimeHour = hourWorked - 40;
            regularPay = 40 * hourlyRate;
            overtimePay = 2 * (overtimeHour * hourlyRate);
        } else {
            regularPay = hourWorked * hourlyRate;
        }
        return regularPay + overtimePay;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHourly Rate: " + getHourlyRate() +
                "\nHours Worked: " +getHourWorked() +
                "\nMonthly Pay: " + calculatePay();
    }
}
