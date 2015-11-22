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
public class MainApp {
    public static void main(String[] args) {
        SalaryCalculator c = new CategoryA(10000, 200);
        Employee e = new Employee("Jennifer", c);
        e.display();
        c = new CategoryB(20000, 800);
        e = new Employee("Shania", c);
        e.display();
    }
}
