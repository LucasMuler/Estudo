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
