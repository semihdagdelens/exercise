package com.udemy.springkursu.service;

import com.udemy.springkursu.model.Employee;
import com.udemy.springkursu.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service diye belirtmesek Spring Contextte Bean olarak tanımlayanmazdı.
@Service
public class EmployeeService {

    //Autowired yani enjekte etme olmasaydı farklı farklı new keywordü ile obejeler olustururduk ama autowired ile havuzdaki ayni itemi kullanmıs oluyoruz
    @Autowired
    private EmployeeRepository employeeRepository;

    //repository'e yönlendirmek icin
    public List<Employee> getAllEmployeeList() {
        employeeRepository.getAllEmployeeList();
        return null;
    }
}
