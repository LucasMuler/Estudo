package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class TesteSeller {
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

//        System.out.println("\n=== test 4: insert seller ===");
//        Seller seller1 = new Seller(7,"Jonas","jonas@icloud",sdf.parse("14/03/2000"),3000, department);
//        sellerDao.insert(seller1);

        System.out.println("\n=== test 5: Update seller ===");
        seller = sellerDao.findById(1);
        seller.setName("Robinson");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== test 6: delete seller ===");
        sellerDao.deleteById(7);
        System.out.println("Delete completed");

    }
}
