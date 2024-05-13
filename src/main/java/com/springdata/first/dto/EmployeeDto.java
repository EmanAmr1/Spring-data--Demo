package com.springdata.first.dto;

import com.springdata.first.model.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class EmployeeDto {


    private Integer id;
    private String firstName;
    private String lastName;
    private Double salary;


    public static EmployeeDto toDtoFun(Employee entity){
        return EmployeeDto.builder()
                .id(entity.getId())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .salary(entity.getSalary())
                .build();
    }

}
