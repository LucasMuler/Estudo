package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        
        return null;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }
}
