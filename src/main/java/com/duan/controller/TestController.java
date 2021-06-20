package com.duan.controller;

import com.duan.mapper.EmployeeMapper;
import com.duan.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
/*

@Controller
public class TestController {
   @Autowired
    private EmployeeMapper employeeMapper;
   @GetMapping("/query")
    public  List<Employee>queryEmployeeList() {
       List<Employee> employeeList = employeeMapper.queryEmployeeList();
      for (Employee employee :employeeList){
          System.out.println(employee);
      }
   return employeeList;
   }

}
*/
