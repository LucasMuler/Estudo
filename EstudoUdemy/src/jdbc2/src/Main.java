import db.DB;
import db.DbException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try{
            conn = DB.getConnection(); // Creates a connection with my dataBase
            st = conn.createStatement(); // Create something like a FileReader that read my db
            rs = st.executeQuery("select * from department"); // creates something like a bufferedReader that get all
            // the items of st
            while(rs.next()){
                System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
            }

        } catch (SQLException e){
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConnection();
        }

    }
}