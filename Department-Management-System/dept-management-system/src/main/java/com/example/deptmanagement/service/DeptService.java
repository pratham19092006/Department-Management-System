package com.example.deptmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.deptmanagement.model.Dept;

@Service
public class DeptService {

    private List<Dept> depts = new ArrayList<>();

    // CREATE
    public Dept addDept(Dept dept) {
        depts.add(dept);
        return dept;
    }

    // READ
    public List<Dept> getAllDepts() {
        return depts;
    }

    // UPDATE
    public Dept updateDept(int id, Dept updatedDept) {
        for (Dept d : depts) {
            if (d.getId() == id) {
                d.setName(updatedDept.getName());
                return d;
            }
        }
        return null;
    }

    // DELETE
    public String deleteDept(int id) {
        depts.removeIf(d -> d.getId() == id);
        return "Dept deleted successfully";
    }
}
