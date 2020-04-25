package academy.learningprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

    public void printSorted() {
        System.out.println("companyName= " + name);

        Collections.sort(employees);

        System.out.println("sorted= " + employees);
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("name cant be null");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void addEmployee(String employee) {
        if (employee == null || employee.isEmpty()) {
            System.out.println("Cant add null employee");
        } else {
            this.employees.add(employee);
        }
    }


 }
