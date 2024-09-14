package david.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL_Connector {
    String url = "jdbc:sqlite:E:/OneDrive - Collège de Bois-de-Boulogne/Applications/CVApp/src/main/java/david/data/CVDatabase.db";
    Connection conn = null;

    //Step 1 of singleton
    private static SQL_Connector instance;

    //step 2 of singleton create private constructor
    private SQL_Connector() {
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //step 3 create getInstance method
    public static SQL_Connector getInstance() {
        if (instance == null) {
            instance = new SQL_Connector();
        }
        return instance;
    }

    public Connection getConnection() {
        return this.conn;
    }
}
