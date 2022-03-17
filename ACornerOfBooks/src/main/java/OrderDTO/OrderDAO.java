/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OrderDTO;

import acornerofbooks.utils.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import acornerofbooks.utils.DBUtils;
import java.sql.Date;

/**
 *
 * @author admin
 */
public class OrderDAO implements Serializable {

    public boolean createNewOrder(String email, String orderID, Date time, String phone,
            String address, String status, int totalAmount)
            throws NamingException, SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean result = false;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "INSERT INTO [Order] (email, orderID, time, phone, "
                        + "address, statusOrder, totalAmount) "
                        + "VALUES (?,?,?,?,?,?,?)";
                ps = conn.prepareStatement(sql);
                ps.setString(1, email);
                ps.setString(2, orderID);
                ps.setDate(3, time);
                ps.setString(4, phone);
                ps.setString(5, address);
                ps.setString(6, status);
                ps.setInt(7, totalAmount);
                int row = ps.executeUpdate();
                if (row > 0) {
                    result = true;
                }

            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
            return result;
        }
    }
}
