package kata5;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Kata51 {
    /*
    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connect2 = DriverManager.getConnection("jdbc:oracle:thin:@10.22.143.90:1521:orcl", "system", "orcl");
        Statement state2 = connect2.createStatement();
        String query2 = "SELECT * FROM PEOPLE";
        ResultSet  rs2 = state2.executeQuery(query2);
        while (rs2.next()) {
            System.out.println(rs2.getInt(1) + " " + rs2.getString(2));
        }
        rs2.close();
        state2.close();
        connect2.close();
        
        Class.forName("org.sqlite.JDBC");
        Connection connect = DriverManager.getConnection("jdbc:sqlite:KATA.DB");
        Statement state = connect.createStatement();
        String query = "SELECT * FROM PEOPLE";
        ResultSet  rs = state.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        
        BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\usuario\\Downloads\\emailsfilev1.txt")));
        String mail;
        
        while ((mail = reader.readLine()) != null)
            state.executeUpdate("INSERT INTO MAILS (MAIL) VALUES ('"+mail+"')");
            
        rs = state.executeQuery("SELECT * FROM MAILS");
        while (rs.next())
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        rs.close();
        state.close();
        connect.close();
        
    }*/
    
}