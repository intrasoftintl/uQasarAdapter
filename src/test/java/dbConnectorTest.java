import eu.uqasar.adapter.dataAccessLayer.dbConnector;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: eleni
 * Date: 1/9/14
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class dbConnectorTest {

    @Test
    public void connectTest() throws SQLException {
        ResultSet rs;

        dbConnector  dbHandler = new dbConnector();
        try {

            dbHandler.dbOpen();
            rs = dbHandler.dbQuery("select * from SystemType;");


            if (rs != null) {
                rs.next();
                System.out.println(rs.getString("id_type") + rs.getString("description"));
                assertEquals("JIRA", rs.getString("description"));
                }


            rs.close();
            dbHandler.dbClose();
        } catch (Throwable t) {
            t.printStackTrace();
        }


    }
}
