package Week6.javadatabase.employees;

import javax.xml.transform.Result;
import java.sql.*;

public class DBConn {
    //Db connection configurations
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/university";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "Fresenius.45";

    public static void main(String[] args) {

        Connection connect = null;
        String sql = "Select * From employees";

        //Create statement and print
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while(data.next()){
                System.out.println("Id: "+data.getInt("id"));
                System.out.println("Name: "+data.getString("employee_name"));
                System.out.println("Name: "+data.getString("position"));
                System.out.println("Name: "+data.getInt("salary"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
