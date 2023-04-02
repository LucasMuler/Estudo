package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {

    Connection conn = DB.getConnection();

    @Override
    public void insert(Department obj) {

        PreparedStatement st = null;

        try{
            st = conn.prepareStatement(
                "insert into department (Id,Name) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, obj.getId());
            st.setString(2,obj.getName());
            int rowsAffected = st.executeUpdate();

            if(rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()){
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            }
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {

        PreparedStatement st = null;

        try{

            st = conn.prepareStatement("update department set Name = ? where Id = ?");
            st.setString(1,obj.getName());
            st.setInt(2,obj.getId());

            st.executeUpdate();
        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {

        PreparedStatement st = null;
        ResultSet rs = null;

        try{

            st = conn.prepareStatement("select * from department where Id = ?");
            st.setInt(1, id);
            rs = st.executeQuery();

            if(rs.next()){
                Department department = instanciarDepartament(rs);
                return department;
            } else{
                return null;
            }


        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Department> findAll() {
        return null;
    }

    private Department instanciarDepartament(ResultSet rs) throws SQLException {
        int id = rs.getInt("Id");
        String nameDep = rs.getString("Name");
        Department dp = new Department(id,nameDep);
        return  dp;
    }
}
