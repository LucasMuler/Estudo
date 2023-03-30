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

public class Teste {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(4);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            Department department = new Department(07,"Suporte");
            Date d = new Date(sdf.parse("18/12/2002").getTime());
            Seller sel = new Seller(11,"Jose","jose@gmail",d,5000,department);
            sellerDao.insert(sel);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(seller);

    }
}
