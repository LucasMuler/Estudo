package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class TesteDepartment {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== test1: create a department ===");
        Department department = new Department(9,"setorTeste");
        departmentDao.insert(department);

    }
}
