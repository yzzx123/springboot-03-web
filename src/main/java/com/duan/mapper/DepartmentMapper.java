package com.duan.mapper;


import com.duan.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Mapper
public interface DepartmentMapper {
    List<Department> queryDepartmentList();

    Department queryDepartmentById(int id);

    int addDepartment(Department department);

    int updateDepartment(Department department);

    int deleteDepartment(int id);

}
