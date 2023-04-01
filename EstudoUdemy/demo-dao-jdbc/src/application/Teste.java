package application;

import db.DB;
import db.DbException;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import javax.naming.Name;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Teste {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== test 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== test 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj: list) {
            System.out.println(obj);
        }

        System.out.println("\n=== test 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj:
             list) {
            System.out.println(obj);
        }

        System.out.println("\n=== test 3: insert seller ===");
        Seller seller1 = new Seller(7,"Jonas","jonas@icloud",sdf.parse("14/03/2000"),3000, department);
        sellerDao.insert(seller1);

    }
}
