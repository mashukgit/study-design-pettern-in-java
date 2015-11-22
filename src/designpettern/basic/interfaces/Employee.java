/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpettern.basic.interfaces;

/**
 *
 * @author mashuk
 */
public class Employee {

    SalaryCalculator empType;

    String name;

    public Employee(String s, SalaryCalculator c) {

        name = s;

        empType = c;

    }

    public void display() {

        System.out.println("Name=" + name);

        System.out.println("salary= " + empType.getSalary());

    }
}
