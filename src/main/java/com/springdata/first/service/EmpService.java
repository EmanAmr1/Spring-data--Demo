package com.springdata.first.service;

import com.springdata.first.model.entity.Employee;
import com.springdata.first.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

   /* public Employee getUser(Integer id){
        Optional<Employee> emp= this.empRepo.findById(id);;
        if(emp.isPresent()){   //equal emp.orElse(null);
            return emp.get();
        }
        return null;
    }*/

    public Employee getUser(Integer id){
        Optional<Employee> emp= this.empRepo.findById(id);
        return emp.orElse(new Employee());
    }

    public Employee save(Employee employee){
      return  this.empRepo.save(employee);

    }

    public void deleteEmp(Integer id){
         this.empRepo.deleteById(id);
    }

    public Employee updateEmp(Employee employee){
        return  this.empRepo.save(employee);

    }
}
