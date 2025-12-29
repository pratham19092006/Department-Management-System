package com.example.deptmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.deptmanagement.model.Dept;
import com.example.deptmanagement.service.DeptService;

@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;

    // POST /depts
    @PostMapping
    public Dept createDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    // GET /depts
    @GetMapping
    public List<Dept> getAllDepts() {
        return deptService.getAllDepts();
    }

    // PUT /depts/{id}
    @PutMapping("/{id}")
    public Dept updateDept(
            @PathVariable int id,
            @RequestBody Dept dept) {
        return deptService.updateDept(id, dept);
    }

    // DELETE /depts/{id}
    @DeleteMapping("/{id}")
    public String deleteDept(@PathVariable int id) {
        return deptService.deleteDept(id);
    }
}
