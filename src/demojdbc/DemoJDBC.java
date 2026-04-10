package demojdbc;
// Connect to MySql 
// 7 steps
/*
    1,import Pakage: java.sql.*;
    2,Load and Register Driver: dowload from MySql Connector
    3,Establish connection
    4,Create the statement
    5,Execute the querry
    6,Process result
    
*/
import java.sql.*;
public class DemoJDBC{
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        String url ="jdbc:mysql://localhost:3306/sys";
        String user="root";
        String password="Phamanhduc2782005";
        String querry="select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver"); // register Driver
        Connection con = DriverManager.getConnection(url, user, password);// step 3
        Statement st = con.createStatement();//Step 4
        ResultSet result = st.executeQuery(querry); //Step 5
        result.next();
        String name = result.getString("name");
        System.out.println(name);
        
    }
}