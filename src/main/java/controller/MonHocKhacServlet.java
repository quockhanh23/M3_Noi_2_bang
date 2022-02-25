package controller;

import model.GiaoVien;
import model.MonHocKhac;
import service.GiaoVienService;
import service.HocSinhService;
import service.MonHocKhacService;
import service.impl.GiaoVienServiceImpl;
import service.impl.HocSinhServiceImpl;
import service.impl.MonHocKhacServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MonHocKhacServlet", value = "/monHocKhacs")
public class MonHocKhacServlet extends HttpServlet {
    private MonHocKhacService monHocKhacService = new MonHocKhacServiceImpl();
    private HocSinhService hocSinhService = new HocSinhServiceImpl();
    private GiaoVienService giaoVienService = new GiaoVienServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            default:
                showListProduct(request, response);
                break;
        }
    }

    private void showListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("monhockhac/list.jsp");
        List<MonHocKhac> list = monHocKhacService.findAll();
        List<GiaoVien> giaoVienList = find(list);
        request.setAttribute("alo", list);
        request.setAttribute("alo1", giaoVienList);
        dispatcher.forward(request, response);
    }

    List<GiaoVien> find(List<MonHocKhac> monHocKhacs) {
        List<GiaoVien> list1 = new ArrayList<>();
        for (int i = 0; i < monHocKhacs.size(); i++) {
            GiaoVien giaoVien = giaoVienService.findById(monHocKhacs.get(i).getMaGV());
            list1.add(giaoVien);
        }
        return list1;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
