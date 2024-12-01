package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/EBillSystem","root","987068@Vjack");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
