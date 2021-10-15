package com.fsoft.service;

import com.fsoft.entity.*;

public abstract class EmployeeService {


    public abstract void addNew(Employee employee);
    
    public abstract void update(Employee employee);

    public abstract void delete(int id);

    public abstract void findIntern();

    public abstract void findExperience();

    public abstract void findFesher();
}

