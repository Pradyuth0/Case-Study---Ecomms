package util;

import java.sql.Connection;

public class DBConnection {
    static Connection connection = null;

	public static Connection getConnection()
	{
		String propstr=DBPropertyUtil.getConnectionString("C:\\Users\\Pradyuth\\OneDrive\\Desktop\\Hexaware\\Ecom---Case-Study-main\\casestudy\\src\\main\\java\\util\\db.properties");
		connection=DBConnUtil.getConnection(propstr);
		return connection;
	}
}
