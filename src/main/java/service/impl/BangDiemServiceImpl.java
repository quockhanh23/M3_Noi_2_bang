package service.impl;

import model.BangDiem;
import model.MonHocKhac;
import service.BangDiemService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BangDiemServiceImpl implements BangDiemService {

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
    public List<BangDiem> findAll() {
        List<BangDiem> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement
                     ("select  * from bangdiem")) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int maHS = rs.getInt("MaHS");
                String maMH = rs.getString("MaMH");
                int diemThi = rs.getInt("DiemThi");
                String ngayKiemTra = rs.getString("NgayKT");
                list.add(new BangDiem(maHS, maMH, diemThi, ngayKiemTra));
            }
        } catch (SQLException e) {
            System.out.println("");
        }
        return list;
    }

    @Override
    public BangDiem findById(int id) {
        return null;
    }

    @Override
    public void add(BangDiem bangDiem) throws SQLException {

    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(BangDiem bangDiem) throws SQLException {
        return false;
    }
}
