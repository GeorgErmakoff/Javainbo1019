package com.company.task9_10;

public class Operator extends Empoley implements EmployeePosition {
    public Operator(String name,String Surname) {
        this.setName(name);
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

}
