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

public class MailListLoader {
    public static ArrayList<String> read (String nameFile) throws ClassNotFoundException, SQLException {
        ArrayList<String> mailList = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection connect = DriverManager.getConnection("jdbc:sqlite:KATA.DB");
        Statement state = connect.createStatement();
        String query = "SELECT MAIL FROM MAILS";
        ResultSet  rs = state.executeQuery(query);
        while (rs.next()) {
            String mail = rs.getString(1);
            if (mail.contains("@"))
                mailList.add(mail);
        }
        
        rs.close();
        state.close();
        connect.close();
        return mailList;
    }
}
