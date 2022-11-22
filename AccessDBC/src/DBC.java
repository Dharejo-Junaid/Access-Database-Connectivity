import java.sql.*;

public class DBC {
    public static void main(String[] args) throws SQLException {

        String url="jdbc:ucanaccess://my_database.accdb";
        Connection c= DriverManager.getConnection(url);

        Statement st=c.createStatement();
        ResultSet result=st.executeQuery("SELECT * FROM my_table");

        while (result.next()) {
            System.out.println(
                    result.getInt(1) + "\t"
                    + result.getString(2) + "\t\t"
                    + result.getString(3)
            );
        }

    }
}
