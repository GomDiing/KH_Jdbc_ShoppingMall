package com.kh.dao;

import com.kh.util.Common;
import com.kh.vo.OrdersDetailVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdersDetailDAO {

    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    Scanner sc = new Scanner(System.in);

    public List<OrdersDetailVO> selectAllOrdersDetail() {
        List<OrdersDetailVO> list = new ArrayList<>();

        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM ORDERS_DETAIL";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int ordersNumber = rs.getInt("ONO");
                String productsNumber = rs.getString("PNO");
                int pcs = rs.getInt("PCS");
                String ordersDate = rs.getString("ODT");
                OrdersDetailVO vo = new OrdersDetailVO(ordersNumber, productsNumber, pcs, ordersDate);
                list.add(vo); // 생성된 객체들 리스트에 저장
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void printOrdersDetail(List<OrdersDetailVO> list) {
        try {
            for (OrdersDetailVO e : list) {
                System.out.print(e.getOrdersNumber() + " ");
                System.out.print(e.getProductsNumber() + " ");
                System.out.print(e.getPcs() + " ");
                System.out.print(e.getOrdersDate() + " ");
                System.out.println();
            }
            Common.close(conn);
            Common.close(stmt);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
