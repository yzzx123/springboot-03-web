package com.duan.controller;


import com.duan.mapper.DepartmentMapper;
import com.duan.mapper.EmployeeMapper;
import com.duan.pojo.Department;
import com.duan.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

@Controller
public class EmployeeController {

     @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    DepartmentMapper departmentMapper;
     @RequestMapping("/emps")
     public String list(Model model){
         Collection<Employee> employees = employeeMapper.queryEmployeeList();
          model.addAttribute("emps",employees);
         return "emp/list";
     }
      @GetMapping("/emp")
    public String toAddpage(Model model){
         //查出所有部门的信息
         Collection<Department> department = departmentMapper.queryDepartmentList();
         model.addAttribute("departments",department);
         return "/emp/add";
     }
    @PostMapping("/emp")
    public String addemp(Employee employee){
          //增加员工
        System.out.println("save=>"+employee);
    employeeMapper.addEmployee(employee);
        return "redirect:/emps";
    }
    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id") Integer id,Model model){
         //查出原来的数据
        Employee employee = employeeMapper.queryEmployeeById(id);
        model.addAttribute("emp",employee);
        //查出所有部门的信息

        Collection<Department> department = departmentMapper.queryDepartmentList();
        model.addAttribute("departments",department);
        return "emp/update";
    }
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        employeeMapper.updateEmployee(employee);
        return "redirect:/emps";
    }
    //删除员工
    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id")Integer id){
        employeeMapper.deleteEmployee(id);
        return "redirect:/emps";
    }
    @RequestMapping("/user/logout")
    public  String logout(HttpSession session){
     session.invalidate();
     return "redirect:/index.html";
    }

}

