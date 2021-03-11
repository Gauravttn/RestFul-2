package com.bootcamp.demo.employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {
    private static List<Employee> emp=new ArrayList<>();

    static {
        emp.add(new Employee(1,23,"Gaurav"));
        emp.add(new Employee(2,33,"Rahul"));
        emp.add(new Employee(3,25,"Megha"));
            }
    public List<Employee> findAll(){
        return emp;
            }
    public Employee empAdd(Employee e){
        emp.add(e);
        return e;
    }
    public Employee findOne(int id){
        for(Employee e:emp){
            if(e.getId()==id) return e;

            }
        return null;
    }
    public String delEmployee(int id){
        for(Employee e:emp){
            if(e.getId()==id){
                emp.remove(e);
                return "Deletion Successful";
            }
        }
        return null;
    }

    public Employee updateEmployeeDetails(Employee employee){
        for(Employee e:emp){
            if(e.getId().equals(employee.getId())){
                e.setName(employee.getName());
                e.setAge(employee.getAge());
                return e;
            }
        }
        return null;
    }
}
