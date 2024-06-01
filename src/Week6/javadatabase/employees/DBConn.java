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
            insertData(st);

            ResultSet data = st.executeQuery(sql);
            printData(data);


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void insertData(Statement st) {
        //Insert data
        String sql1 = "insert into employees (employee_name, position,salary) values ('Chris', 'Accountant',5000)";
        String sql2 = "insert into employees (employee_name, position,salary) values ('Tom', 'Project Manager',4000)";
        String sql3 = "insert into employees (employee_name, position,salary) values ('Nick', 'Manager',3000)";
        String sql4 = "insert into employees (employee_name, position,salary) values ('Suzanne', 'Manager',7000)";
        String sql5 = "insert into employees (employee_name, position,salary) values ('Anna', 'Executive',3000)";
        try{
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
            st.executeUpdate(sql3);
            st.executeUpdate(sql4);
            st.executeUpdate(sql5);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }

    private static void printData(ResultSet data) {
        try{
            while(data.next()){
                System.out.println("Id: "+data.getInt("id"));
                System.out.println("Name: "+data.getString("employee_name"));
                System.out.println("Name: "+data.getString("position"));
                System.out.println("Name: "+data.getInt("salary"));
            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
