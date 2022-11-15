package com.microservice.department.controller;

import com.microservice.department.entity.Department;
import com.microservice.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside Save Department Method of DepartmentController");
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department  findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside Find Department Method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }


}
