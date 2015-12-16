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
public class CategoryB implements SalaryCalculator {

    double salesAmt;
    double baseSalary;
    final static double commission = 0.02;

    public CategoryB(double sa, double base) {
        baseSalary = base;
        salesAmt = sa;
    }

    @Override
    public double getSalary() {
        return (baseSalary + (commission * salesAmt));
    }

}
