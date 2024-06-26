package com.springdata.first.controller;

import com.springdata.first.dto.EmployeeDto;
import com.springdata.first.model.entity.Employee;
import com.springdata.first.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
     private EmpService empService;

    @GetMapping("/get-emp")
    public Employee getUser(@RequestParam Integer id){
    return empService.getUser(id);
    }

    @GetMapping("/get-empDto")  //using dto
    public EmployeeDto getUserDto(@RequestParam Integer id){
        return empService.getUserDto(id);
    }
    @PostMapping("/save-emp")
    public Employee save(@RequestBody Employee employee){
        return empService.save(employee);
    }


    @PostMapping("/save-empDto")
    public EmployeeDto save(@RequestBody EmployeeDto employee){
        return  empService.save(employee);
    }


    @PostMapping("/update-emp")
    public Employee update(@RequestBody Employee employee){
        return empService.updateEmp(employee);
    }


    @DeleteMapping("/delete-emp")
    public void delete(@RequestParam Integer id){
          empService.deleteEmp(id);
    }
}
