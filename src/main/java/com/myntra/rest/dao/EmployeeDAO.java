package com.myntra.rest.dao;

import com.myntra.rest.model.Employee;
import com.myntra.rest.model.Employees;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
    private static Employees list = new Employees();

    static {
        list.getEmployeeList().add(new Employee(1, "Sumit", "Jain", "sumit.jain@myntra.com"));
        list.getEmployeeList().add(new Employee(1, "Rahul", "Kaura", "rahul.kaura@myntra.com"));
    }

    public Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
