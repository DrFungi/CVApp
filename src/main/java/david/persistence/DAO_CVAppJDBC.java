package david.persistence;

import david.model.Category;

import java.sql.*;

public class DAO_CVAppJDBC implements I_DAO_CVApp {

    Connection con;

    public DAO_CVAppJDBC() {
        this.con = SQL_Connector.getInstance().getConnection();

    }
    @Override
    public int insertCategory(Category category) {
        int result = -1;

        try {
            PreparedStatement ps = this.con.prepareStatement(SQL_Box.ADD_CATEGORY);
            ps.setString(1, category.getCategoryName());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
