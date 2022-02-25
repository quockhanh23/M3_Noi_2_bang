package service.impl;

import model.MonHocKhac;
import service.MonHocKhacService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MonHocKhacServiceImpl implements MonHocKhacService {

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
    public List<MonHocKhac> findAll() {
        List<MonHocKhac> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("select  * from monhockhac")) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int maHS = rs.getInt("MaHS");
                int maGV = rs.getInt("MaGV");
                int maMH = rs.getInt("MaMH");
                int id = rs.getInt("id");
                list.add(new MonHocKhac(maHS, maGV, maMH, id));
            }
        } catch (SQLException e) {
            System.out.println("");
        }
        return list;
    }

    @Override
    public MonHocKhac findById(int id) {
        MonHocKhac monHocKhac = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("select * from monhockhac where id =?")) {
            System.out.println(preparedStatement);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int maHS = rs.getInt("MaHS");
                int maGV = rs.getInt("MaGV");
                int maMH = rs.getInt("MaMH");
                monHocKhac = new MonHocKhac(maHS, maGV, maMH, id);
            }
        } catch (SQLException ignored) {
        }
        return monHocKhac;
    }

    @Override
    public void add(MonHocKhac monHocKhac) throws SQLException {

    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(MonHocKhac monHocKhac) throws SQLException {
        return false;
    }
}
