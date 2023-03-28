import db.DB;
import db.DbException;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try{

            conn = DB.getConnection();
            st = conn.prepareStatement(
        "UPDATE seller " //Faz uma alteração na tabela seller
            + "SET BaseSalary = BaseSalary + ? " //soma um valor ao campo BaseSalary
            + "WHERE " //na condicao de que
            + "(DepartmentId = ?)"); // o Id de departamento seja

            st.setDouble(1, 200);
            st.setInt(2,2);

            int rownsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected " + rownsAffected);

        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}