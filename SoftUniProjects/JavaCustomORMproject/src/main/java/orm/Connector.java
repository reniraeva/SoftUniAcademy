package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connector {
    private static Connection connection;
    private static final String connectionString = "jdbc:mysql://localhost:3306/";

    public static void createConnection(String userName, String password,String dbName) throws SQLException {

        Properties properties = new Properties();
        properties.setProperty("user",userName);
        properties.setProperty("password",password);

        connection = DriverManager.getConnection(connectionString + dbName,properties);

    }

    public static Connection getConnection(){
        return connection;
    }
}
