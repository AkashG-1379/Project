package com.csi.controller;

import com.csi.model.Department;
import com.csi.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentService;

    @PostMapping("/")
    public Department saveData(@RequestBody Department department)
    {
        return departmentService.saveData(department);

    }

    @GetMapping("/{departmentId}")
    public Optional<Department> getDataById(@PathVariable long departmentId)
    {
        return departmentService.getDataById(departmentId);
    }
}
