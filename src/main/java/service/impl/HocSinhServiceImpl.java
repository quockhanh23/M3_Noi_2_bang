package service.impl;

import model.HocSinh;
import model.MonHocKhac;
import service.HocSinhService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HocSinhServiceImpl implements HocSinhService {

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/quanlydiemthi?useSSL=false", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<HocSinh> findAll() {
        List<HocSinh> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("select  * from hocsinh")) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int maHS = rs.getInt("MaHS");
                int tenHS = rs.getInt("TenHS");
                String ngaySinh = rs.getString("NgaySinh");
                String lop = rs.getString("Lop");
                String GT = rs.getString("GT");
                list.add(new HocSinh(maHS, tenHS, ngaySinh, lop, GT));
            }
        } catch (SQLException e) {
            System.out.println("");
        }
        return list;
    }

    @Override
    public HocSinh findById(int id) {
        return null;
    }

    @Override
    public void add(HocSinh hocSinh) throws SQLException {

    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(HocSinh hocSinh) throws SQLException {
        return false;
    }
}
