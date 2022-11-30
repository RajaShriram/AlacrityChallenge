package com.alacrity;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int averageAge(Company company){
        List<Employee> employeeList = company.getEmployeeList();

        int totalEmployee=employeeList.size();
        int totalEmployeeAge=0;

        //Looping over the employee object and adding all the age of the employee.
        for (Employee employee : employeeList){
            totalEmployeeAge+=employee.getAge();
        }

        return totalEmployeeAge/totalEmployee;
    }

    public static String maturedPerson(Company company){
        List<Employee> employeeList = company.getEmployeeList();
        String maturedEmployee = null;
        int maxAge=0;

        //Looping over the employee object and getting the maturedPerson name.
        for (Employee employee : employeeList){

            int employeeAge= employee.getAge();
            String employeeName=employee.getName();
            if (employeeAge>=maxAge)
            {
                maxAge = employeeAge;
                maturedEmployee=employeeName;
            }
        }

        return maturedEmployee;
    }

    public static String youngestPerson(Company company){
        List<Employee> employeeList = company.getEmployeeList();
        String youngestEmployee = null;
        int minAge=0;


        //Looping over the employee object and getting the youngest Person name.
        for (Employee employee : employeeList){

            //assign the first employee age for the first time.
            if(minAge==0){
                minAge= employee.getAge();
            }

            int employeeAge= employee.getAge();
            String employeeName=employee.getName();

            if (employeeAge<=minAge)
            {
                minAge = employeeAge;
                youngestEmployee=employeeName;
            }
        }

        return youngestEmployee;
    }


    public static void main(String[] args) {


        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(new Employee("Alice",20));
        employeeList.add(new Employee("Bob",25));
        employeeList.add(new Employee("Carol",30));
        employeeList.add(new Employee("Dave",35));

        //Adds the employee list to the company object model
        Company company = new Company("Alacrity",employeeList);

        System.out.println("Welcome to the Company: " + company.getName());
        System.out.println("Average Age  : "     +averageAge(company));
        System.out.println("Matured Person : "  +maturedPerson(company));
        System.out.println("youngest Person : " +youngestPerson(company));




    }
}