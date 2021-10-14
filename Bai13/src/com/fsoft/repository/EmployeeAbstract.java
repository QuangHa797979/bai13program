package com.fsoft.repository;

import com.fsoft.entity.*;

public abstract class EmployeeAbstract {


    public abstract void addNew(Employee employee);
    
    public abstract void update(Employee employee);

    public abstract void delete(int id);

    public abstract void findIntern();

    public abstract void findExperience();

    public abstract void findFesher();
}

