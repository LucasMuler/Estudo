package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try{
            st = conn.prepareStatement("select seller.*, department.Name as DepName "
                    + "from seller inner join department "
                    + "on seller.DepartmentId = department.Id "
                    + "where seller.Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if(rs.next()){
                int idDep = rs.getInt("DepartmentId");
                String nameDep = rs.getString("DepName");
                Department dep = new Department(idDep, nameDep);

                int sellerId = rs.getInt("Id");
                String sellerName = rs.getString("Name");
                String sellerEmail = rs.getString("Email");
                Date sellerDate = rs.getDate("BirthDate");
                double sellerBaseSalary = rs.getDouble("BaseSalary");
                Seller seller = new Seller(sellerId,sellerName,sellerEmail,sellerDate,sellerBaseSalary,dep);
                return seller;
            } else{
                return null;
            }

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }


    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
}
