package com.duan.mapper;


import com.duan.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Mapper
public interface EmployeeMapper {
    List<Employee> queryEmployeeList();

    Employee queryEmployeeById(int id);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteEmployee(int id);

}
