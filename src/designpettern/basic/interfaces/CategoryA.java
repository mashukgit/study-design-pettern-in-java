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
public class CategoryA implements SalaryCalculator {

    private double baseSalary;
    private double overTime;

    public CategoryA(double baseSalary, double overTime) {
        this.baseSalary = baseSalary;
        this.overTime = overTime;
    }

    @Override
    public double getSalary() {
        return baseSalary + overTime;
    }

}
