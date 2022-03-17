/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderProduct;

import acornerofbooks.utils.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.naming.NamingException;
import acornerofbooks.utils.DBUtils;

/**
 *
 * @author admin
 */
public class OrderProductDAO implements Serializable {

    public boolean createNewOrderProduct(String orderID, String ISBN, int quantity) throws NamingException, SQLException, ClassNotFoundException, Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        boolean result = false;

        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO OrderProduct (orderID, ISBN, quantity) VALUES (?, ?, ?)";
                ps = conn.prepareStatement(sql);
                ps.setString(1, orderID);
                ps.setString(2, ISBN);
                ps.setInt(3, quantity);
                int row = ps.executeUpdate();
                if (row > 0) {
                    result = true;
                }
            }

        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return result;
    }

}
