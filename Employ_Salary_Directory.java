package Map_Assignment;
import java.util.*;

public class Employ_Salary_Directory {
    public static void main(String[] args) {

        // Map to store employee name (String) and salary (Double)
        Map<String, Double> employees = new HashMap<>();

        // 1. Add at least 6 employees
        employees.put("Rahul", 45000.0);
        employees.put("Sneha", 52000.0);
        employees.put("Amit", 48000.0);
        employees.put("Priya", 60000.0);
        employees.put("Rohit", 55000.0);
        employees.put("Kavita", 47000.0);

        // 2. Give raises
        giveRaise(employees, "Rahul", 10);   // 10% raise
        giveRaise(employees, "Amit", 5);     // 5% raise
        giveRaise(employees, "Kavita", 12);  // 12% raise
        giveRaise(employees, "John", 15);    // Employee not found

        // 3. Print average salary
        double average = calculateAverageSalary(employees);
        System.out.println("\nAverage Salary: " + average);

        // 4. Print highest-paid employee(s)
        printHighestPaid(employees);
    }

    // Method to give raise
    public static void giveRaise(Map<String, Double> employees, String name, double percent) {
        if (employees.containsKey(name)) {
            double currentSalary = employees.get(name);
            double newSalary = currentSalary + (currentSalary * percent / 100);
            employees.put(name, newSalary);

            System.out.println(name + " received a " + percent + "% raise. New Salary: " + newSalary);
        } else {
            System.out.println("Employee not found: " + name);
        }
    }

    // Method to calculate average salary
    public static double calculateAverageSalary(Map<String, Double> employees) {
        double sum = 0;
        for (double salary : employees.values()) {
            sum += salary;
        }
        return sum / employees.size();
    }

    // Method to print highest-paid employees
    public static void printHighestPaid(Map<String, Double> employees) {
        double maxSalary = Collections.max(employees.values());

        System.out.println("\nHighest Salary: " + maxSalary);
        System.out.println("Employee(s) with highest salary:");

        for (String name : employees.keySet()) {
            if (employees.get(name) == maxSalary) {
                System.out.println("- " + name);
            }
        }
    }
}


