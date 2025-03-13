import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager
                    .getConnection("jdbc:mysql://localhost:phpmyadmin/Online_Library_Management_System", "root", "");
            System.out.println("Connected Successfully");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Borrower");
            while (rs.next()) {
                System.out.println("BORROWER_NAME=" + rs.getInt(1)
                        + " BID=" + rs.getString(2)
                        + " CONTACT_INFORMATION="
                        + rs.getString(3)
                        + " MEMBERSHIP_STATUS=" + rs.getString(4)
                        + " ISBN=" + rs.getString(5));
            }
            System.out.println("___________________________________________________________");
            conn.close();
        } catch (Exception s) {
            System.out.println(s);
        }
    }
}
