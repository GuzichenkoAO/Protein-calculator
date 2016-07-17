import java.sql.*;

/**
 * @author Guzichenko Artem on 17.07.2016.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String login = "root";
        String pass = "root";
        String host = "jdbc:mysql://localhost:3306/test";

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(host, login, pass);
        Statement st;
        st = conn.createStatement();
        st.execute("CREATE TABLE TEST12(ID INT PRIMARY KEY, NAME VARCHAR(255))");
        st.close();
        conn.close();



    }

}
