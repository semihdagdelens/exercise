package com.udemy.springkursu.controller;


import com.udemy.springkursu.model.Employee;
import com.udemy.springkursu.service.EmployeeService;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


//Controller karşılayıcı iletiyi service'e gönderir service süzgeçten geçirir kontrol eder daha sonra repository'e database'e gider.
@RestController
@RequestMapping("/rest/api")  // https://localhost:8080/rest/api yaptıgımızda buraya girmiş oluruz
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //service'e yönlendirmek için
    @GetMapping("/")
    public List<Employee> getAllEmployeeList(){
        employeeService.getAllEmployeeList();
        return null;
    }

}
