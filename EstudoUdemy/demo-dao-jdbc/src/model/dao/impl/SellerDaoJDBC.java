package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerDaoJDBC implements SellerDao {

    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "insert into seller"
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                            + "values "
                            + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1,obj.getName());
            st.setString(2, obj.getEmail());
            st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
            st.setDouble(4,obj.getBaseSalary());
            st.setInt(5,obj.getDepartment().getId());

            int rowsAfected = st.executeUpdate();

            if (rowsAfected > 0){
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()){
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                throw new DbException("erro inesperado, não foi afetado nenhuma linha");
            }

            System.out.println("Rows affected: " + rowsAfected);

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void update(Seller obj) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
                    + "WHERE Id = ?");

            st.setString(1,obj.getName());
            st.setString(2, obj.getEmail());
            st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
            st.setDouble(4,obj.getBaseSalary());
            st.setInt(5,obj.getDepartment().getId());
            st.setInt(6, obj.getId());

            st.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

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
                Department dep = instanciarDepartament(rs);
                Seller seller = instanciarSeller(rs,dep);
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

    private Seller instanciarSeller(ResultSet rs, Department dep) throws SQLException {
        int sellerId = rs.getInt("Id");
        String sellerName = rs.getString("Name");
        String sellerEmail = rs.getString("Email");
        Date sellerDate = rs.getDate("BirthDate");
        double sellerBaseSalary = rs.getDouble("BaseSalary");
        Seller seller = new Seller(sellerId,sellerName,sellerEmail,sellerDate,sellerBaseSalary,dep);
        return seller;
    }

    private Department instanciarDepartament(ResultSet rs) throws SQLException {
        int id = rs.getInt("DepartmentId");
        String nameDep = rs.getString("DepName");
        Department dp = new Department(id,nameDep);
        return  dp;
    }

    @Override
    public List<Seller> findAll() {

        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                    + "FROM seller INNER JOIN department "
                    + "ON seller.DepartmentId = department.Id "
                    + "ORDER BY Name");

            rs = st.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while(rs.next()){

                Department dep = map.get(rs.getInt("DepartmentId"));

                if (dep == null){
                    dep = instanciarDepartament(rs);
                    map.put(rs.getInt("DepartmentId"), dep);
                }

                Seller obj = instanciarSeller(rs, dep);
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                    + "FROM seller INNER JOIN department "
                    + "ON seller.DepartmentId = department.Id "
                    + "WHERE DepartmentId = ? "
                    + "ORDER BY Name");

            st.setInt(1, department.getId());
            rs = st.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while(rs.next()){

                Department dep = map.get(rs.getInt("DepartmentId"));

                if (dep == null){
                    dep = instanciarDepartament(rs);
                    map.put(rs.getInt("DepartmentId"), dep);
                }

                Seller obj = instanciarSeller(rs, dep);
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }
}
