package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TesteDepartment {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n === test1: create a department ===");
        Department department = new Department(10,"setorTeste2");
//        departmentDao.insert(department);
        System.out.println("Department created success");

        System.out.println("\n === test2: find by Id ===");
        department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("\n === test3: update a department ===");
        department = departmentDao.findById(2);
        department.setName("testeUpdate");
        departmentDao.update(department);
        System.out.println("update success");

        System.out.println("\n === test4: delete a department ===");
        departmentDao.deleteById(10);
        System.out.println("delete successes");

        System.out.println("\n === test5: findAll ===");
        for (Department dep: departmentDao.findAll()) {
            System.out.println(dep);
        }
    }
}
