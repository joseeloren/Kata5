package kata5;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata51 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        Class.forName("org.sqlite.JDBC");
        Connection connect = DriverManager.getConnection("jdbc:sqlite:KATA.DB");
        Statement state = connect.createStatement();
        String query = "SELECT * FROM PEOPLE";
        ResultSet  rs = state.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        rs.close();
        state.close();
        connect.close();
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connect2 = DriverManager.getConnection("jdbc:oracle:thin:@10.22.143.90:1521:orcl", "system", "orcl");
        Statement state2 = connect.createStatement();
        String query2 = "SELECT * FROM PEOPLE";
        ResultSet  rs2 = state.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        rs2.close();
        state2.close();
        connect2.close();
    }
    
}