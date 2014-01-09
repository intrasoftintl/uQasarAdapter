/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.uqasar.adapter.dataAccessLayer;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author eleni
 */
public class dbConnector {
    
    private Statement stmt;
	private String stmtStr;
	private Connection dbConnection;

	public void dbOpen()
            throws ClassNotFoundException, SQLException,
            InstantiationException, IllegalAccessException, IOException {


      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      Properties properties = new Properties();
      InputStream in =classLoader.getResourceAsStream("database.properties");
      properties.load(in);

     /*
     Enumeration el =properties.propertyNames();
     while (el.hasMoreElements()) {
         System.out.println("4");
         String key = (String) el.nextElement();
         System.out.println(key + " -- " + properties.getProperty(key));
     }
     */

     String url =    properties.getProperty("database.jdbc.connectionURL").toString();
     String driver = properties.getProperty("database.jdbc.driverClass").toString();
     String dbName = properties.getProperty("database.jdbc.name").toString();
     String userName = properties.getProperty("database.jdbc.username").toString();
     String password = properties.getProperty("database.jdbc.password").toString();


       /*
       String url =    "jdbc:mysql://127.0.0.1:3306/";
       String driver = "com.mysql.jdbc.Driver";
       String dbName = "empower_db";
       String userName = "root";
       String password = "!uflow!";
        */

        Class.forName(driver).newInstance();
                dbConnection = DriverManager.getConnection(url+dbName,userName,password);
                stmt = dbConnection.createStatement();		
	}

	public ResultSet dbQuery(String sqlQuery)
	throws SQLException
	{
		ResultSet rs;
		clearRequestFields();
		this.stmtStr = new String(sqlQuery);
		rs = stmt.executeQuery(stmtStr);
		return(rs);
	}

	public int dbUpdate(String updateString)
	throws SQLException
	{
		//int updatesMade;
                int key=1;
		clearRequestFields();
		this.stmtStr = new String(updateString);
		//updatesMade = stmt.executeUpdate(stmtStr);
		//return(updatesMade);
                
                stmt.executeUpdate(updateString,Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = stmt.getGeneratedKeys();
                if ( rs.next() ) {
                // Retrieve the auto generated key(s).
                key = rs.getInt(1);
                }   
                return key;
                
	}

	public void dbClose()
	throws SQLException
	{
		clearRequestFields();
		dbConnection.close();
	}

	private void clearRequestFields()
	{
		stmtStr = null;
	}
    
}
