package com.fsoft.service;

import com.fsoft.entity.*;

public interface EmployeeService {


    void addNew(Employee employee);
    
    void update(Employee employee);

   void delete(int id);

    void findIntern();

    void findExperience();

    void findFesher();
}

