package service.impl;

import model.GiaoVien;
import service.GiaoVienService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GiaoVienServiceImpl implements GiaoVienService {

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
    public List<GiaoVien> findAll() {
        List<GiaoVien> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("select  * from giaovien")) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int maGV = rs.getInt("MaGV");
                String tenGV = rs.getString("TenGV");
                String sdt = rs.getString("SDT");
                list.add(new GiaoVien(maGV, tenGV, sdt));
            }
        } catch (SQLException e) {
            System.out.println("");
        }
        return list;
    }


    @Override
    public GiaoVien findById(int id) {
        GiaoVien giaoVien = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("select * from giaovien where id =?")) {
            System.out.println(preparedStatement);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int maGv = resultSet.getInt("MaGV");
                String tenGv = resultSet.getString("TenGV");
                String sdt = resultSet.getString("SDT");
                giaoVien = new GiaoVien(maGv, tenGv, sdt);
            }
        } catch (SQLException ignored) {
        }
        return giaoVien;
    }

    @Override
    public void add(GiaoVien giaoVien) throws SQLException {

    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(GiaoVien giaoVien) throws SQLException {
        return false;
    }
}
