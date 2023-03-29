import db.DB;
import db.DbException;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try{

            conn = DB.getConnection(); // Opens a connection with your DB
            st = conn.prepareStatement( //Creates a SQL term to execute
             "insert into seller"
             + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
             + "values "
             + "(?, ?, ?, ?, ?)",
             Statement.RETURN_GENERATED_KEYS);

            st.setString(1,"Lucas Muller"); // add in the firs parameter the String "Lucas"
            st.setString(2,"lucas@gmail.com");
            st.setDate(3,new java.sql.Date(sdf.parse("18/12/2002").getTime()));
            st.setDouble(4, 3000);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate(); // executes de prepareStatement and return a int

            if(rowsAffected > 0){
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done ! Id = " + id);
                }
            } else{
                System.out.println("No rows affected");
            }

            System.out.println("Done! Rowns affected: " + rowsAffected);

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } catch (ParseException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();

        }

    }
}