package com.sampletest.sbr.controllers;
import com.sampletest.sbr.models.Employee;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class EmployeeController
{
    private List<Employee> employees = createList();

    @RequestMapping(value = "/employees", method = RequestMethod.GET,
            produces = "application/json")
    public List<Employee> getEmployees()
    {
        return employees;
    }

    private static List<Employee> createList()
    {
        List<Employee> tempEmployees = new ArrayList<>();

        Employee emp1 = new Employee();
        emp1.setName("Muhittin");
        emp1.setId(1);
        emp1.setDepartment("HR");

        Employee emp2 = new Employee();
        emp2.setName("Hayrettin");
        emp2.setId(2);
        emp2.setDepartment("Finance");

        tempEmployees.add(emp1);
        tempEmployees.add(emp2);

        return tempEmployees;
    }
}
