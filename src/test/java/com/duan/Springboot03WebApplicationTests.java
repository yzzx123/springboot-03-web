package com.duan;

import com.duan.mapper.DepartmentMapper;
import com.duan.mapper.EmployeeMapper;
import com.duan.pojo.Department;
import com.duan.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class Springboot03WebApplicationTests {
  @Resource
   private Department department;
    @Test
    void contextLoads() throws SQLException {
       //List<Department> departmentList = departmentMapper.queryDepartmentList();
//  for (Department department : departmentList) {
                System.out.println(department);
                        }
                        }

