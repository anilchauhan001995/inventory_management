
package manage;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class Database_Class 
{
    Connection con;
    PreparedStatement pst1,pst2,pst3;
    ResultSet rs1,rs2;
    public Database_Class()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:XE","inventory","anil");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
