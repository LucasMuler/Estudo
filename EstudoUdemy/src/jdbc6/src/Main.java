import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;

        try{
            conn = DB.getConnection();
            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");

//            int x = 1;
//            if (x < 2){
//                throw new SQLException("Fake error");
//            }

            int rows2 = st.executeUpdate("update seller set BaseSalary = 3090 where DepartmentId = 2");

            conn.commit();

            System.out.println(rows1);
            System.out.println(rows2);

        } catch (SQLException e){
            try {
                conn.rollback();
                throw new DbException("Transação voltou" + e.getMessage());
            } catch (SQLException ex) {
                throw new RuntimeException("Error trying to roolback: " + ex.getMessage());
            }
        } finally {

            DB.closeStatement(st);
            DB.closeConnection();

        }

    }
}