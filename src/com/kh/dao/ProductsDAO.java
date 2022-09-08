package com.kh.dao;

import com.kh.util.Common;
import com.kh.vo.ProductsVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsDAO {

    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    Scanner sc = new Scanner(System.in);

    /**
     * PRODUCTS 테이블에서 모든 컬럼의 데이터 조회
     * SQL : SELECT * FROM PRODUCTS
     * @return SQL 실행한 데이터가 담긴 List
     */
    public List<ProductsVO> selectAllProducts() {
        List<ProductsVO> list = new ArrayList<>();

        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM PRODUCTS";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String pdNumber = rs.getString("PNO");
                String pdName = rs.getString("PNAME");
                String type = rs.getString("TYPE");
                int price = rs.getInt("PRICE");
                String color = rs.getString("COLOR");
                String size = rs.getString("PSIZE");
                int stock = rs.getInt("STOCK");
                ProductsVO vo = new ProductsVO(pdNumber, pdName, type, price, color, size, stock);
                list.add(vo); // 생성된 객체들 리스트에 저장
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    /**
     * 전달받은 ResultSet의 모든 데이터를 출력
     * @param list PRODUCTS 테이블의 데이터가 담긴 리스트
     */
    public void printProducts(List<ProductsVO> list) {
        for(ProductsVO e : list) {

            System.out.print(e.getPdNumber() + " ");
            System.out.print(e.getPdName() + " ");
            System.out.print(e.getType() + " ");
            System.out.print(e.getPrice() + " ");
            System.out.print(e.getColor() + " ");
            System.out.print(e.getSize() + " ");
            System.out.print(e.getStock() + " ");
            System.out.println();
        }
        Common.close(conn);
        Common.close(stmt);
    }
}
